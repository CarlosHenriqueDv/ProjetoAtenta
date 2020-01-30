package br.atenta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.atenta.bean.Pessoa;
import br.atenta.bean.Trabalhador;
import br.atenta.connection.ConnectionFactory;




public class TrabalhadorDAO {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	private Pessoa pessoaBean;
	
	
	public void inserir(Trabalhador trabalhador) throws SQLException {
		
		try {

			connection = ConnectionFactory.getConnection();

			sql = ("insert into trabalhador "
				+ " (NOME, CPF,SEXO, DATA_NASCIMENTO)"
				+ " values(?,?,?,?)");

			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(2, trabalhador.getNome());
			preparedStatement.setString(3, trabalhador.getCpf());
			preparedStatement.setDate(4, trabalhador.getDataNascimento());

			preparedStatement.execute();

		} finally {

			preparedStatement.close();

			connection.close();

		}

		
	}
	
	
	public Trabalhador consultarPorId(Trabalhador trabalhador) throws SQLException {

		try {

			Trabalhador newTrabalhador = null;

			connection = ConnectionFactory.getConnection();

			sql = "select * from pessoa where idpessoa = ?";

			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, trabalhador.getMatriculaTrabalhador());

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				newTrabalhador.setMatriculaTrabalhador(resultSet.getInt("idpessoa"));
				newTrabalhador.setCpf(resultSet.getString("cpf"));
				newTrabalhador.setNome(resultSet.getString("nome"));
				newTrabalhador.setRemuneracao(resultSet.getDouble("nome"));

			}

			return newTrabalhador;

		} finally {

			preparedStatement.close();
			resultSet.close();
			connection.close();

		}

	}
	
}
