package br.atenta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.atenta.bean.Dependente;
import br.atenta.bean.Pessoa;
import br.atenta.connection.ConnectionFactory;

public class DependenteDAO extends Pessoa{
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	private Pessoa pessoaBean;
	
	
	
	public void inserir(Dependente dependente) throws SQLException {
		
		try {

			connection = ConnectionFactory.getConnection();

			sql = ("insert into dependente "
				+ " (NOME, CPF,SEXO, DATA_NASCIMENTO,ID_TRABALHADOR)"
				+ " values(?,?,?,?,?)");

			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(2, dependente.getNome());
			preparedStatement.setString(3, dependente.getCpf());
			preparedStatement.setDate(4, dependente.getDataNascimento());
			preparedStatement.setInt(5, dependente.getMatriculaDoTrabalhador());

			preparedStatement.execute();

		} finally {

			preparedStatement.close();

			connection.close();

		}

		
	}
	

}
