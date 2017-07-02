/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightproducts.proyecto.servicios;

import com.lightproducts.proyecto.modelo.Producto;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProductoServ {
    public String insertar(Producto producto);
    public String modificar(Producto producto);
    public String eliminar(int id);
    public Producto obtenerPorId(int id);
    public List<Producto> listar();
}
