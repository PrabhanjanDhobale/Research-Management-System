/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.ConnectionDB;
import java.sql.*;
import java.util.ArrayList;

public class CreateTopicController {
    public int createTopic(ArrayList<String> topic) throws SQLException {
        System.out.println(topic);
        Connection conn = null;
        try{
            System.out.println(topic.get(0) + " " + topic.get(1) + " " + topic.get(2) + " " + topic.get(3));
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("insert into topic (TopicName, TopicDesc, GuideName, Accessibility) values(?,?,?,?)");
            stmt.setString(1,topic.get(0));
            stmt.setString(2,topic.get(1));
            stmt.setString(3,topic.get(2));
            stmt.setString(4,topic.get(3));
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
    
    public ArrayList getAllData() throws SQLException {
        Connection conn = null;
        ArrayList<ArrayList> data = new ArrayList<ArrayList>();
//        ArrayList dt = new ArrayList();
        try{
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("select * from topic");
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {
                ArrayList dt = new ArrayList();
                dt.add(rs.getInt(1));
                dt.add(rs.getString(2));
                dt.add(rs.getString(3));
                dt.add(rs.getString(4));
                dt.add(rs.getString(5));
                data.add(dt);
            }
            
            System.out.println(data);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            
        }finally {
          conn.close();  
        }
        
        return data;
    }
    
    public ArrayList<String> getTopic() throws SQLException {
        Connection conn = null;
        ArrayList<String> names = new ArrayList<String>();
        try{
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("select TopicName from topic");
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {
                names.add(rs.getString(1));
            }
            
            System.out.println(names);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            
        }finally {
          conn.close();  
        }
        
        return names;
    }
    
    public ArrayList getTopicData(String topic) throws SQLException {
        Connection conn = null;
        ArrayList topicData = new ArrayList();
        try{
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("select * from topic where TopicName=?");
            stmt.setString(1,topic);
            ResultSet rs = stmt.executeQuery();
           
            while(rs.next()) {
                topicData.add(rs.getInt(1));
                topicData.add(rs.getString(2));
                topicData.add(rs.getString(3));
                topicData.add(rs.getString(4));
                topicData.add(rs.getString(5));
            }
            
            System.out.println(topicData);
            
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            
        }finally {
          conn.close();  
        }
        
        return topicData;
    }
    
    public int updateTopicInfo(ArrayList data) throws SQLException {
        Connection conn = null;
     try{
            System.out.println(data);
            System.out.println(data.size());
            conn = new ConnectionDB().Connect();
            String sqlUpdate = "UPDATE topic "
                + "SET TopicName=?, TopicDesc=?, GuideName=?, Accessibility=? "
                + "WHERE TopicName=?";
            
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate);
              
            pstmt.setString(1, data.get(0).toString());
            pstmt.setString(2, data.get(1).toString());
            pstmt.setString(3, data.get(2).toString());
            pstmt.setString(4, data.get(3).toString());
            pstmt.setString(5, data.get(0).toString());
            
            
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
    
    public int deleteTopic(String topic) throws SQLException {
        Connection conn = null;
        try{
            conn = new ConnectionDB().Connect();
            PreparedStatement stmt=conn.prepareStatement("delete from topic where TopicName=?");
            stmt.setString(1,topic);
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
