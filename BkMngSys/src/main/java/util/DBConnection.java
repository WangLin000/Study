package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static String Driver="org.mariadb.jdbc.Driver";
	private static String USERNAME="study";
	private static String PASSWORD="123456789";
	private static String URL="jdbc:mariadb://localhost:3306/jw?createDatabaseIfNotExist=true";
	public Connection connection;
	public DBConnection() {
		try {
			Class.forName(Driver);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
