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
    
}
