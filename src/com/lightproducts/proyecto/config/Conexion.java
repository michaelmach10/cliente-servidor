/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightproducts.proyecto.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author michael.machacuay
 */
public class Conexion {
    Connection cx = null;
    String url="jdbc:mysql://localhost/bd_proyecto";
    String usuario="root";
    String pass="";
    public static final Logger log = LogManager.getLogger(Conexion.class.getName());
    public Connection getConexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cx = DriverManager.getConnection(url, usuario, pass);
        }catch(ClassNotFoundException | SQLException c){
            JOptionPane.showMessageDialog(null, "error: "+c);
        }
        return cx;
    }
    
    public void cerrarConexion() {
        try{
            cx.close();
        } catch(SQLException e) {
            log.trace(e);
        }
    }
}
