/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Producto;
import java.util.ArrayList;
import java.sql.ResultSetMetaData;
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

    public ArrayList<Producto> consultaProductos(String querySql) throws Exception {
        try{
            consultarDB(querySql);
            Producto producto = null;
            ArrayList<Producto> productos = new ArrayList<>();
            ResultSetMetaData metaDataSql = resultado.getMetaData();
            int columnasSql = metaDataSql.getColumnCount();
            while(resultado.next()){
                producto=new Producto();
                for(int i=1;i<=columnasSql;i++){
                    switch (metaDataSql.getColumnName(i)) {
                        case "codigo" -> producto.setCodigo(resultado.getInt(i));   
                        case "nombre" -> producto.setNombre(resultado.getString(i));
                        case "precio" -> producto.setPrecio(resultado.getDouble(i));
                        case "codigo_fabricante" -> producto.setCodigoFabricante(resultado.getInt(i));
                        default -> throw new AssertionError();
                    }
                }
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
    
    public void ingresarProducto(String querySql) throws Exception {
        try{
            insertarModificarEliminarDB(querySql);            
        }
        catch(Exception e){
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
    public void modificarProducto(String querySql) throws Exception {
        try{
            insertarModificarEliminarDB(querySql);            
        }
        catch(Exception e){
            throw e;
        } finally {
            desconectarDB();
        }
    }
    
}
