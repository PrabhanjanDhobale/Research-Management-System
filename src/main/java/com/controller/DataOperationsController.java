/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataOperationsController {
    
    public int addDataText(ArrayList data) throws SQLException {
        System.out.println(data);
        Connection conn = null;
        try{
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("insert into TextData (Id, title, data) values(?,?,?)");
            stmt.setInt(1,Integer.parseInt(data.get(0).toString()));
            stmt.setString(2,data.get(1).toString());
            stmt.setString(3,data.get(2).toString());
           
            if(stmt.executeUpdate() > 0) 
                return 1;          
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return 0;
        }finally {
          conn.close();  
        }
        
        return 0;
    }
    
    public int addDataLinks(ArrayList data) throws SQLException {
        System.out.println(data);
        Connection conn = null;
        try{
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("insert into TextLinks (Id, title, data) values(?,?,?)");
            stmt.setInt(1,Integer.parseInt(data.get(0).toString()));
            stmt.setString(2,data.get(1).toString());
            stmt.setString(3,data.get(2).toString());
           
            if(stmt.executeUpdate() > 0) 
                return 1;          
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return 0;
        }finally {
          conn.close();  
        }
        
        return 0;
    }
    
    public int addMediaData(ArrayList data) throws SQLException {
        System.out.println("Data is : " + data);
        Connection conn = null;
        try{
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("insert into MediaData (Id, imageName, imagePath) values(?,?,?)");
            stmt.setInt(1,Integer.parseInt(data.get(0).toString()));
            stmt.setString(2,data.get(1).toString());
            stmt.setString(3,data.get(2).toString());
           
            if(stmt.executeUpdate() > 0) 
                return 1;          
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return 0;
        }finally {
          conn.close();  
        }
        
        return 0;
    }
}
