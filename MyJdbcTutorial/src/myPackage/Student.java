package myPackage;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Student {
	public void createDatabase() {

		try {

			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";

			String username = "root"; // MySQL credentials

			String password = "mysql";

			Connection conn = DriverManager.getConnection(url, username, password);

			Statement stm = conn.createStatement();

			String query = "create database codingwallah";

			stm.execute(query);

			System.out.println("database created succesfully");
			conn.close();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void createTable() {

		try {

			String url = "jdbc:mysql://localhost:3306/codingwallah";

			String username = "root"; // MySQL credentials

			String password = "mysql";

			Connection conn = DriverManager.getConnection(url, username, password);

			Statement stm = conn.createStatement();

			String query = "create table student( sid int(3),sname varchar(40),semail varchar(40))";

			stm.execute(query);

			System.out.println("Table created  successfully");

			// stm.execute(query);

		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void createData() {

		try {

			String url = "jdbc:mysql://localhost:3306/";

			String db = "codingwallah";

			String username = "root"; // MySQL credentials
			String password = "mysql";

			Connection conn = DriverManager.getConnection(url + db, username, password);
			String query = "INSERT into student (sid,sname,semail) VALUES(?,?,?))";

			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 10);
			pstm.setString(2, "Atul");
			pstm.setString(3, "atulsingh050823@gmail.com");

			pstm.execute();
			// pstm.executeUpdate();

			System.out.println("Table created  successfully");
			conn.close();

		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void readData() {

		try {

			String url = "jdbc:mysql://localhost:3306/";

			String db = "codingwallah";

			String username = "root"; // MySQL credentials
			String password = "mysql";

			Connection conn = DriverManager.getConnection(url + db, username, password);
			String query = " Select * from student";

			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				System.out.println(" id  = " + rs.getInt(1));
				System.out.println(" name  = " + rs.getString(2));
				System.out.println(" email  = " + rs.getString(3));

			}
			System.out.println("reads  successfully" + rs);
			conn.close();

		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void updateData() {
		try {

			String url = "jdbc:mysql://localhost:3306/";

			String db = "codingwallah";

			String username = "root"; // MySQL credentials
			String password = "mysql";

			Connection conn = DriverManager.getConnection(url + db, username, password);
			String query = "UPDATE  student set sid=? where sname =?";

			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 10);
			pstm.setString(2, "Atul");

			pstm.execute();
			// pstm.executeUpdate();

			System.out.println("Table updated  successfully");
			conn.close();

		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}
}
