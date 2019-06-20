package model;
import java.sql.Connection;
import java.sql.DriverManager;
public class DB {

//singleton pattern class
 

	private DB() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("WELCOME________________________");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Home", "root", "root");
		} catch (Exception e) {
			System.out.println("Errror in AdminRegistration: " + e);
		}
		return con;

	}
}
