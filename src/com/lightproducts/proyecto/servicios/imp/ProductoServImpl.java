/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightproducts.proyecto.servicios.imp;

import com.lightproducts.proyecto.dao.ProductoDAO;
import com.lightproducts.proyecto.modelo.Producto;
import com.lightproducts.proyecto.servicios.ProductoServ;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductoServImpl implements ProductoServ {

    ProductoDAO productoDao;
    
    @Override
    public String insertar(Producto producto) {
        if(productoDao.insertar(producto) != 0){
            return "REGISTRADO";
        } else {
            return "ERROR";
        }
    }

    @Override
    public String modificar(Producto producto) {
        if(productoDao.modificar(producto) != 0){
                return "ACTUALIZADO";
            }else{
                return "ERROR";
            }
    }

    @Override
    public String eliminar(int id) {
        if(productoDao.eliminar(id) != 0){
            return "ELIMINADO";
        }else{
            return "ERROR";
        }
    }

    @Override
    public Producto obtenerPorId(int id) {
        return productoDao.obtenerPorId(id);
    }

    @Override
    public List<Producto> listar() {
        return productoDao.listar();
    }
    
}
