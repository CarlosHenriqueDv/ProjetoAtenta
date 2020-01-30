package br.atenta.teste;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.atenta.bean.Trabalhador;
import br.atenta.connection.ConnectionFactory;


public class TestaConexao {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date data = (Date) sdf.parse("1990-01-02");
		
		Trabalhador traba = new Trabalhador();
		traba.setCpf("123.852.000.21");
		traba.setMatriculaTrabalhador(1);;
		traba.setNome("teste inserindo no banco");;
		traba.setSexo("F");
		traba.setDataNascimento((data));
		
		
	}
		
		/*public void testeConnectionFactory() throws SQLException{
			
			ConnectionFactory con = new ConnectionFactory();
			con.setUrl("jdbc:mysql://localhost:3306/cadastro?useTimezone=true&serverTimezone=UTC");
			con.setUser("root");
			con.setPass("mysql");
			con.setForName("com.mysql.cj.jdbc.Driver");
			
			Connection conexao = con.getConnection();
			assertEquals(true, conexao.isValid(0));
			conexao.close();
			assertEquals(false, conexao.isValid(0));
			
		}
		
*/
	
	
	
	
	
	
}
