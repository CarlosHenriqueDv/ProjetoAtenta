package br.atenta.teste;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import br.atenta.connection.ConnectionFactory;


public class TestaConexao {

	
		
		public void testeConnectionFactory() throws SQLException{
			
			ConnectionFactory con = new ConnectionFactory();
			con.setUrl("jdbc:mysql://localhost:3306/cadastro");
			con.setUser("root");
			con.setPass("mysql");
			con.setForName("com.mysql.jdbc.Driver");
			
			Connection conexao = con.getConnection();
			assertEquals(true, conexao.isValid(0));
			conexao.close();
			assertEquals(false, conexao.isValid(0));
			
		}
		

}
