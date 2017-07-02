/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightproducts.proyecto.dao.imp;

import com.lightproducts.proyecto.config.Conexion;
import com.lightproducts.proyecto.dao.ProductoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.lightproducts.proyecto.modelo.Producto;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael
 */
public class ProductoDAOImpl implements ProductoDAO {

    Conexion cx = new Conexion();
    //Connection cn = cx.getConexion();
    Statement st = null;

    @Override
    public int insertar(Producto producto) {
        Connection cn = cx.getConexion();
        int rs = 0;
        try {
            //Statement st = cn.createStatement();
            st = cn.createStatement();
            String sql = "INSERT INTO producto VALUES(null,'" + producto.getNombre() + "','" + producto.getPrecio() + "','" + producto.getStock() + "')";
            rs = st.executeUpdate(sql);
            cx.cerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return rs;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Producto producto) {
        Connection cn = cx.getConexion();
        int rs = 0;
        try {
            //Statement st = cn.createStatement();
            st = cn.createStatement();
            String sql = "UPDATE producto SET nombre='"+producto.getNombre()+"', precio='"+producto.getPrecio()+"', stock='"+producto.getStock()+"' WHERE id='"+producto.getId()+"'";
            rs = st.executeUpdate(sql);
            cx.cerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return rs;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(int id) {
        Connection cn = cx.getConexion();
        int rs = 0;
        try {
            //Statement st = cn.createStatement();
            st = cn.createStatement();
            String sql = "DELETE FROM producto WHERE id='"+id+"'";
            rs = st.executeUpdate(sql);
            cx.cerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return rs;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto obtenerPorId(int id) {
        Connection cn = cx.getConexion();
        Producto producto = new Producto();
        PreparedStatement ps = null;
        try {
            //Statement st = cn.createStatement();
            st = cn.createStatement();
            //String sql = "SELECT * FROM producto WHERE id='"+id+"'";
            //ResultSet rs = st.executeQuery(sql);
            String sql = "SELECT * FROM producto WHERE id=?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            //st = cx.createStatement();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setStock(rs.getInt("stock"));
            }
            //cx.cerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        }
        return producto;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> listar() {
        List<Producto> lista = new ArrayList();
        ResultSet rs = null;
        Connection cn = cx.getConexion();
        try {
            //Statement st = cn.createStatement();
            st = cn.createStatement();
            String sql = "select * from producto";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                //lista.add(Producto.loadProducto(rs));
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setStock(rs.getInt("stock"));
                lista.add(producto);
            }
            cx.cerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
