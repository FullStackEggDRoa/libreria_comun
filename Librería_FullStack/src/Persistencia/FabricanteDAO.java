/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Fabricante;
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
    
    public ArrayList<Fabricante> listarFabricante() throws Exception {
        try{
            String querySql = "SELECT * FROM fabricante";
            consultarDB(querySql);
            //Fabricante fabricantes = null;
            ArrayList<Fabricante> fabricantes = new ArrayList<>();
            
            return fabricantes;
        }
        catch(Exception e){
            e.printStackTrace();
            desconectarDB();
            throw e;
        }
        
    }
    
}
