/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serivciosPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPelicula(ArrayList<Pelicula> pl){
        boolean respuesta=false;
        String titulo;
        String director;
        float duracionHoras=0;
        
        System.out.println("Ingreso de Pelicula: ");
        
        do{
            System.out.print("Ingrese el Nombre de la Pelicula: ");
            titulo = leer.next();
            System.out.print("Ingrese el Director de la Pelicula: ");
            director = leer.next();
            System.out.print("Ingrese la duración de la Pelicula (Horas): ");
            duracionHoras =leer.nextFloat();
            System.out.print("Desea Ingresar otra Película? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
            pl.add(new Pelicula(titulo,director,duracionHoras));
       
        }while(respuesta);
        
    }
    public String filtroDuracion(ArrayList<Pelicula> pl){
        //ArrayList<Pelicula> plAux = new ArrayList<>(pl); // Desactivar lineas 45-48
        ArrayList<Pelicula> plAux = new ArrayList<>();
        // Rellenar Colección.
        /*for (int i=0;i<pl.size();i++) {
            plAux.add(new Pelicula("-","-",i));
        }*/
        
        try{
            //Collections.fill(plAux,new Pelicula("-","-",0)); //Activar Lineas 45-48
            //Collections.copy(plAux, pl); //Activar Lineas 45-48
            plAux.addAll(pl);
        } catch(Exception e){
            System.out.println(plAux.toString());
            
        }
        
        Iterator<Pelicula> it = plAux.iterator();
        while(it.hasNext()){
            if(it.next().getDuracionHoras()<1){
               it.remove();
            }
        }
        
        return plAux.toString();
    }
    
}
