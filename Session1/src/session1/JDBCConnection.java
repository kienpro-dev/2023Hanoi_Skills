/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1;

import java.sql.*;
import java.util.Stack;

/**
 *
 * @author tienk
 */
public class JDBCConnection {

    
    	public static Connection getConnection() {
		final String user = "root";
		final String password = "123456";

		final String url = "jdbc:mysql://localhost:3306/session1";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
