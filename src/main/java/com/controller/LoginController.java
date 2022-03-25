package com.controller;

import com.model.ConnectionDB;
import com.view.AccountInfo;
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
    
    public ArrayList getLoginDetails() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt;
        ArrayList data = new ArrayList();
        try{
            conn = new ConnectionDB().Connect();
            
            stmt=conn.prepareStatement("select * from register where username=?");
            
            
            stmt.setString(1,AccountInfo.uname);
            
            System.out.println(stmt.toString());
            
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {
                data.add(rs.getString(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getString(4));
            }
            
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            
        }finally {
          conn.close();  
        }
        
        return data;
    }
    
    public int UpdateLoginData(String uname, String password, String expirement, String company) throws SQLException {
        Connection conn = null;
        try{   
            conn = new ConnectionDB().Connect();
            String sqlUpdate = "UPDATE register SET username=?, password=?, expirement=?, company=? WHERE username=?";
            
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate);
              
            pstmt.setString(1, uname);
            pstmt.setString(2, password);
            pstmt.setString(3, expirement);
            pstmt.setString(4, company);
            pstmt.setString(5, AccountInfo.uname);
           
            if(pstmt.executeUpdate() > 0){
                return 1;
            }
            return 0;
        } catch(Exception ex) {
            System.out.println(ex.getMessage().toString());
            return 0;
        }finally {
          conn.close();  
        }
    }
}
