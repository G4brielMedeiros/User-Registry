package gabrielmedeiros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private ConnectionFactory(){};

    public static Connection getConnection() {

        Connection conn = null;


            String driver   = "mysql";
            String address  = "localhost";
            String name     = "user_management_db";
            String user     = "root";
            String pass     = "password";

            String url = "jdbc:" + driver + "://" + address + "/" + name;

            try {
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Connected to database.");
            } catch(SQLException e) {
                System.out.println("Failed database connection.");
            }

        return conn;



    } //METHOD
} //CLASS
