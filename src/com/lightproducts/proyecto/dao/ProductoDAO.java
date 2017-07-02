/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightproducts.proyecto.dao;

import java.util.List;
import com.lightproducts.proyecto.modelo.Producto;

/**
 *
 * @author Michael
 */
public interface ProductoDAO {
    public int insertar(Producto producto);
    public int modificar(Producto producto);
    public int eliminar(int id);
    public Producto obtenerPorId(int id);
    public List<Producto> listar();
}
