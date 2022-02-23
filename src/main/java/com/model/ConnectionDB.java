package com.model;

import java.sql.*;

public class ConnectionDB {
    
    public Connection Connect() {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbName = "researchDB";
            String dbUserName = "root";
            String dbPassword = "Prabhu@99";
            String connectionString = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
            conn = DriverManager.getConnection(connectionString);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        return conn;
    }
}
