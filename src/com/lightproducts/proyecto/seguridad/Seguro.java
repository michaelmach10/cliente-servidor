/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightproducts.proyecto.seguridad;

import com.lightproducts.proyecto.config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Seguro {

    Conexion cx = new Conexion();
    Connection cn = cx.getConexion();
    private String cadena;
    private PreparedStatement ps;

    public Seguro(String cadena) {
        this.cadena = cadena;
    }
    
    public PreparedStatement getConsulta() throws SQLException {
        ps = cn.prepareStatement(cadena);
        return ps;
    }
    
}
