/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Producto;
import Persistencia.ProductoDAO;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class servicios_Producto {
    
    private ProductoDAO dao;

    public servicios_Producto() {
        this.dao = new ProductoDAO("tienda");
    }
    
    public ArrayList<Producto> listarNombreProductos() throws Exception {

        try {
            ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT nombre FROM producto";
            return dao.consultaProductos(querySql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList<Producto> listarNombrePreciosProductos() throws Exception {

        try {
            ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT nombre,precio FROM producto";
            return dao.consultaProductos(querySql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList<Producto> listarNombreRango120_202() throws Exception {

        try {
            ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT * FROM producto WHERE precio > 120 AND precio < 202 ";
            return dao.consultaProductos(querySql);

        } catch (Exception e) {
            throw e;
        }
    }
    
}
