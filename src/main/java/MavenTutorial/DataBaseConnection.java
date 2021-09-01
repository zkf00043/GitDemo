package MavenTutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	public static void main(String[] args) throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "zkf00043", "Sun$trike1");
		
		Statement statement = connection.createStatement(); 
		ResultSet resultSet = statement.executeQuery("select * from EmployeeInfo where name = 'Steve';");
		resultSet.next();
		System.out.println(resultSet.getString("location"));
	}

}
