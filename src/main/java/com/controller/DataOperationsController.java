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
    
    public ArrayList getTopicData(String tableName, int id) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt;
        ArrayList data = new ArrayList();
        try{
            conn = new ConnectionDB().Connect();
            if(tableName.equals("TextData")){
                stmt=conn.prepareStatement("select title from TextData where Id=?");
            } else {
                stmt=conn.prepareStatement("select linkTitle from TextLinks where Id=?");
            }
            
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {
                data.add(rs.getString(1));
            }
            
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            
        }finally {
          conn.close();  
        }
        
        return data;
    }
    
    public ArrayList getData(String title, String tableName) {
        Connection conn = null;
        PreparedStatement stmt;
        ArrayList data = new ArrayList();
        try{
            conn = new ConnectionDB().Connect();
            if(tableName.equals("TextData")){
                stmt=conn.prepareStatement("select * from TextData where title=?");
            } else {
                stmt=conn.prepareStatement("select * from TextLinks where linkTitle=?");
            }
            stmt.setString(1,title);
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {
                    data.add(rs.getInt(1));
                    data.add(rs.getInt(2));
                    data.add(rs.getString(3));
                    data.add(rs.getString(4));
            }
           
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
       return data;
    }
    
    public int UpdateData(String title, String tablename, String data) throws SQLException {
        Connection conn = null;
        try{   
            conn = new ConnectionDB().Connect();
            String sqlUpdate;
            
            if(tablename.equals("TextData")){
                sqlUpdate = "UPDATE TextData SET data=? WHERE title=?";
            } else {
                sqlUpdate = "UPDATE TextLinks SET links=? WHERE linkTitle=?";
            }
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate);
              
            pstmt.setString(1, data);
            pstmt.setString(2, title);
           
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
