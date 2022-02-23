package com.controller;

import com.model.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;

public class LoginController {
    
    public int register(ArrayList<String> user) throws SQLException {
        Connection conn = null;
        try{
            System.out.println(user.get(0) + " " + user.get(1) + " " + user.get(2) + " " + user.get(3));
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("insert into register values(?,?,?,?)");
            stmt.setString(1,user.get(0));
            stmt.setString(2,user.get(1));
            stmt.setString(3,user.get(2));
            stmt.setString(4,user.get(3));
            if(stmt.executeUpdate() > 0) 
                return 1;          
        } catch(Exception ex) {
            System.out.println(ex.getMessage().toString());
            return 0;
        }finally {
          conn.close();  
        }
        
        return 0;
    }
    
    public int login(ArrayList<String> data) throws SQLException {
        Connection conn = null;
        try {
            conn = new ConnectionDB().Connect();
//            System.out.println(data);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select username, password from register");
            rs.next();
            System.out.println(rs.getString("username") + " " + rs.getString("password"));
            if(!data.get(0).equals(rs.getString("username")))
                return 3;
            else if(!data.get(1).equals(rs.getString("password")))
                return 2;
            else 
                return 1;
        } catch(Exception ex) {
             System.out.println(ex.getMessage().toString());
            return 0;
        }finally {
          conn.close();  
        }
    }
}
