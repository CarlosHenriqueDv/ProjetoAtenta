package br.atenta.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	private static Connection connection;
	
	
	private static String url = "jdbc:mysql://localhost:3306/cadastro?useTimezone=true&serverTimezone=UTC";
	

	private static String user = "root";

	private static String pass = "mysql";
	
	private static String forName = "com.mysql.cj.jdbc.Driver";

	public static Connection getConnection() {

		try {

			Class.forName(forName);

			connection = DriverManager.getConnection(url, user, pass);

		}

		catch (SQLException e) {

			System.out.println("Erro Conex�o com Banco de Dados - Detalhes: " + e);
			
			throw new RuntimeException(e);

		}

		catch (ClassNotFoundException e) {

			System.out.println("Erro Carregamento Driver Conex�o - Detalhes: " + e);

			throw new RuntimeException(e);

		}

		return connection;

	}


	public static void setUrl(String url) {
		ConnectionFactory.url = url;
	}

	public static void setUser(String user) {
		ConnectionFactory.user = user;
	}

	public static void setPass(String pass) {
		ConnectionFactory.pass = pass;
	}

	public static void setForName(String forName) {
		ConnectionFactory.forName = forName;
	}
	
}
