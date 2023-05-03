/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Persistencia.AutorDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosAutor {
    
    //Atributos
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //serviciosAutor sA = new serviciosAutor();
    
    private final AutorDAO DAO;

    public serviciosAutor() {
       this.DAO = new AutorDAO();
    }
    
    public void crearAutor(){
        Autor autor = new Autor();
        System.out.println(".:: INGRESO AUTOR ::..");
        System.out.print("Ingrese Nombre del Autor: ");
        String nombreAutor = leer.next();
        autor.setNombre(nombreAutor);
        DAO.guardarAutor(autor);
    }
    
    public Autor buscarAutor(){
        List<Autor> autores;
        autores = new ArrayList<>();
        int contadorResultados = 1;
        int opcion=0;
        String comanda = "";
        
        System.out.println(".:: BUSCAR AUTOR ::..");
        System.out.print("Ingrese Criterio de Busqueda: ");
        String criterio = leer.next();
        
        String queryJpql = "SELECT a FROM Autor a WHERE a.nombre LIKE '%"+criterio+"%'";
        
        
        do{
            try{
                autores=DAO.listarAutores(queryJpql);
            } catch (Exception e){
            e.printStackTrace();
            return null;
        }
            for(Autor aux : autores) {
                    comanda+=contadorResultados+". "+aux.getNombre()+" ";
                    contadorResultados++;
                }

            System.out.print("Elija una Opción: [ "+comanda+contadorResultados+". Ingresar Nuevo Autor]: ");
            opcion=leer.nextInt();
            if(opcion < contadorResultados){
                contadorResultados=0;
            }else{
                crearAutor();
                contadorResultados=1;
            }
        }while(contadorResultados!=0);
        return autores.get(opcion-1);
    }
    
    public List<Autor> listarAutores(){
    
        try {
            String queryPsql = "SELECT a FROM Autor a";
            return DAO.listarAutores(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
