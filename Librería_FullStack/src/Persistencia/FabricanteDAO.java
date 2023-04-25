/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Fabricante;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public final class FabricanteDAO extends DAO{

    
    //Atributos
    
    //Contructores
    public FabricanteDAO(String database) {
        super(database);
    }
    
    public ArrayList<Fabricante> consultaFabricantes(String querySql) throws Exception {
        try{
            consultarDB(querySql);
            Fabricante fabricante = null;
            ArrayList<Fabricante> productos = new ArrayList<>();
            ResultSetMetaData metaDataSql = resultado.getMetaData();
            int columnasSql = metaDataSql.getColumnCount();
            while(resultado.next()){
                fabricante=new Fabricante();
                for(int i=1;i<=columnasSql;i++){
                    switch (metaDataSql.getColumnName(i)) {
                        case "codigo" -> fabricante.setCodigo(resultado.getInt(i));   
                        case "nombre" -> fabricante.setNombre(resultado.getString(i));
                        default -> throw new AssertionError();
                    }
                }
                productos.add(fabricante);
            }
            return productos;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarDB();
            throw e;
        }
    }
    
    public void ingresarFabricante(String querySql) throws Exception {
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
