package com.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconn {
    private static Connection conn;
    public static Connection getconn()
    {
        if(conn==null)
        {
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcemp", "root", "6375");
            }
           catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        return conn;
    }
}
