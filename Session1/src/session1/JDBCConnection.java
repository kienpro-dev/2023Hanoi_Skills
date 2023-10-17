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

    private String driver;

    private String url;

    private String username;
    private String password;

    private Stack<Connection> pools;

    public JDBCConnection() {
        this.driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        this.url = "jdbc:mysql://localhost:3306/session1";

        this.username = "it6020003_kiennt";
        this.password = "123456";

        this.pools = new Stack<>();
    }

    public Connection getConnection(String objectName) throws SQLException {
        // TODO Auto-generated method stub
        if (this.pools.isEmpty()) {
            System.out.println(objectName + " have created a new connection.");
            return DriverManager.getConnection(this.url, this.username, this.password);
        } else {
            System.out.println(objectName + " have popped the connection.");
            return this.pools.pop();
        }
    }
}
