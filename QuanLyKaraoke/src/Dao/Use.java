/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Use {
    private String user="sa";
    private  String pass="nhv";
    private java.sql.Connection connectionll;
   private   String url="jdbc:sqlserver://localhost:1433;databasename=QuanLy";

    public Use() {
     try {
         connectionll=java.sql.DriverManager.getConnection(url, user, pass);
       } catch (SQLException ex) {
         
       }  
    
    }

    public Connection getConnectionll() {
        return connectionll;
    }
    
   
   
   
    
}
