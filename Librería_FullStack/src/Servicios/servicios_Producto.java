/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Producto;
import Persistencia.ProductoDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicios_Producto {
    
    private ProductoDAO dao;
    private 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

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
    public ArrayList<Producto> listarBusquedaProducto(String criterio) throws Exception {

        try {
            ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT * FROM producto WHERE nombre LIKE '%"+criterio+"%'";
            return dao.consultaProductos(querySql);

        } catch (Exception e) {
            throw e;
        }
    }
    public ArrayList<Producto> listarProductoBarato() throws Exception {

        try {
            ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT nombre,precio FROM producto ORDER BY precio ASC LIMIT 1";
            return dao.consultaProductos(querySql);

        } catch (Exception e) {
            throw e;
        }
    }
    public void ingresarProducto() throws Exception {
        Producto producto = new Producto();
        System.out.println("..:: Ingreso de Producto ::..");
        System.out.print("Ingrese Nombre de Producto: ");
        producto.setNombre(leer.next());
        System.out.print("Ingrese Precio: ");
        producto.setPrecio(leer.nextDouble());
        
        System.out.println("Ingrese Fabricante [Elija Opción]: ");
        
    }
}
