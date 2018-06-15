package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

		public static Connection getConnection() {
			
			
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				return DriverManager.getConnection("jdbc:mysql:3306//localhost/cadastroveiculo", "root", "123456789");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				throw new RuntimeException("Erro ao abrir a conexão com o Connection Factory", e);
			}
		}
}
