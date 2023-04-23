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
    
    public ArrayList<String> listarNombreProductos() throws Exception {

        try {
            ArrayList<String> nombreProductos = new ArrayList<>();
            String querySql = "SELECT * FROM producto";
            for(Producto aux : dao.consultaProductos(querySql)){
                nombreProductos.add(aux.getNombre());
            }

            return nombreProductos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList<String []> listarNombrePreciosProductos() throws Exception {

        try {
            ArrayList<String []> nombreProductos = new ArrayList<>();
            String querySql = "SELECT * FROM producto";
            for(Producto aux : dao.consultaProductos(querySql)){
                String[] registro = new String[2];
                registro[0]=aux.getNombre();
                registro[1]=Double.toString(aux.getPrecio());
                nombreProductos.add(registro);
                
            }

            return nombreProductos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
}
