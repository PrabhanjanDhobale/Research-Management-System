/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prabhanjan
 */
public class ForgotPasswordController {
    Connection conn = null;
    public int checkPassword(String fav) throws SQLException {
        try{
            System.out.println(fav);
            this.conn = new ConnectionDB().Connect();
            Statement st = this.conn.createStatement();
            String sql = "SELECT * FROM register WHERE expirement='" +fav+"'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) { 
                return 1;
            }
            return 0;
        } catch(Exception ex) {
            System.out.println(ex.getMessage().toString());
            return 0;
        }finally {
          this.conn.close();  
        }
    }
    
    public int changePassword(String password, String expirement) throws SQLException {
        try{
            System.out.println(password);
            this.conn = new ConnectionDB().Connect();
            String sqlUpdate = "UPDATE register "
                + "SET password = ? "
                + "WHERE expirement = ?";
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate);
              
            pstmt.setString(1, password);
            pstmt.setString(2, expirement);
            
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
