/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.DriverManager;

/**
 *
 * @author Jonathan
 */
public class Connection {
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "1234";
    private static final String url = "jdbc:mysql://localhost:3306/supermercado";
    
    public Connection() throws ClassNotFoundException{
        con = null;
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch(ClassNotFoundException | Exception e){
            dasdaddas
        }
    }
            
          
}
