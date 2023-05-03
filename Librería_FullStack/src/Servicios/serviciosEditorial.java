/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosEditorial {
    //Atributos
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final EditorialDAO DAO;

    public serviciosEditorial() {
       this.DAO = new EditorialDAO();
    }
    
    public void crearEditorial(){
        Editorial editorial = new Editorial();
        System.out.println(".:: INGRESO EDITORIAL ::..");
        System.out.print("Ingrese Nombre de la Editorial: ");
        String nombreEditorial = leer.next();
        editorial.setNombre(nombreEditorial);
        DAO.guardarEditorial(editorial);
    }
    
    public Editorial buscarEditorial(){
        List<Editorial> editoriales = new ArrayList<>();
        int contadorResultados = 1;
        int opcion=0;
        String comanda = "";
        
        System.out.println(".:: BUSCAR EDITORIAL ::..");
        System.out.print("Ingrese Criterio de Busqueda: ");
        String criterio = leer.next();
        
        String queryJpql = "SELECT e FROM Editorial e WHERE e.nombre LIKE '%"+criterio+"%'";
        
        do{
            try{
                editoriales=DAO.listarEditoriales(queryJpql);
            } catch (Exception e){
                e.printStackTrace();
                return null;
            }

            for(Editorial aux : editoriales) {
                    comanda+=contadorResultados+". "+aux.getNombre()+" ";
                    contadorResultados++;
                }

            System.out.print("Elija una Opción: [ "+comanda+contadorResultados+". Ingresar Nueva Editorial]: ");
            opcion=leer.nextInt();
            if(opcion < contadorResultados){
                contadorResultados=0;
            }else{
                crearEditorial();
                contadorResultados=1;
            }
            
        }while(contadorResultados!=0);
        return editoriales.get(opcion-1);
    }
    
    public List<Editorial> listarEditoriales(){
    
        try {
            String queryPsql = "SELECT e FROM Editorial e";
            return DAO.listarEditoriales(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
