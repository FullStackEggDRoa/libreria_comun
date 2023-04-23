/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public final class ProductoDAO extends DAO {
    //Atributos
    
    //Contructores
    public ProductoDAO(String database) {
        super(database);
        
    }

    public ArrayList<String> listarNombreProductos() throws Exception {
        try{
            String querySql = "SELECT nombre FROM producto";
            consultarDB(querySql);
            String nombreProducto = null;
            ArrayList<String> nombreProductos = new ArrayList<>();
            while(resultado.next()){
                
                nombreProducto=resultado.getString(1);
                nombreProductos.add(nombreProducto);
            
            }
            return nombreProductos;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarDB();
            throw e;
        }
    }
    public ArrayList<Producto> consultaProductos(String querySql) throws Exception {
        try{
            //String querySql = "SELECT * FROM producto";
            consultarDB(querySql);
            Producto producto = null;
            ArrayList<Producto> productos = new ArrayList<>();
            while(resultado.next()){
                producto=new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            return productos;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarDB();
            throw e;
        }
    }
}
