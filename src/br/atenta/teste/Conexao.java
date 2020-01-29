package br.atenta.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.atenta.connection.ConnectionFactory;

public class Conexao {

	public static void main(String[] args) {
		
		Connection	connection	=	new	ConnectionFactory().getConnection();
		System.out.println("Conex�o	aberta!");
		try {
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
