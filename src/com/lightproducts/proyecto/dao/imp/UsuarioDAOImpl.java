/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightproducts.proyecto.dao.imp;

import com.lightproducts.proyecto.config.Conexion;
import com.lightproducts.proyecto.dao.UsuarioDAO;
import com.lightproducts.proyecto.seguridad.Seguro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author michael.machacuay
 */
public class UsuarioDAOImpl implements UsuarioDAO {
    
    int res;
    Conexion cn = new Conexion();
    Statement st;
    ResultSet rs;
    String sql;
    
    @Override
    public int validar(String user, String clave) {
        //Connection cx = cn.getConexion();
        //sql="SELECT * FROM usuario WHERE user='"+user
        //    +"' AND clave='"+clave+"'";
        sql="SELECT * FROM usuario WHERE user=? AND clave=?";
        Seguro seguro = new Seguro(sql);
        PreparedStatement ps = null;
        try {
            //ps = cx.prepareStatement(sql);
            ps = seguro.getConsulta();
            ps.setString(1, user);
            ps.setString(2, clave);
            //st = cx.createStatement();
            rs = ps.executeQuery();
            //cx.close();
            if(rs.next()){
                res=1;
            }else{
                res=2;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } finally {
            try {
                if(ps!=null){
                    ps.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
