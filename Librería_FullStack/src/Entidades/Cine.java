/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Cine {
    //Atributos
    private ArrayList <Pelicula> peliculas;
    private SalaCine sala;
    private float precio;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Constructores

    public Cine(ArrayList<Pelicula> peliculas, SalaCine sala, float precio) {
        this.peliculas = peliculas;
        this.sala = sala;
        this.precio = precio;
    }
    
    //Métodos

    public SalaCine getSala() {
        return sala;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    public void asignarAsiento(){
        int randomi=(int) (Math.random()*(sala.getFilas()-1));
        int randomj=(int) (Math.random()*(sala.getColumnas()-1));
        if(!sala.getEspectadores().isEmpty()){
            for(Espectador aux: sala.getEspectadores()){
                if(sala.validarAsiento(randomi,randomj)){
                    if(aux.getEdad() < sala.getPelicula().getEdadMinima() && aux.getDinero()<precio){
                        aux.setAsiento(Integer.toString(randomi+1)+sala.getLetraColumna()[randomj]);
                        sala.getAsientos().put((Integer.toString(randomi+1)+sala.getLetraColumna()[randomj]),true);
                    }
                }
            }
        }
    }
    public void importarEspectadores(){
        
        
        if(!sala.getEspectadores().isEmpty()){
            for(Espectador aux : sala.getEspectadores()){
                int randomi=(int) (Math.random()*(sala.getFilas()));
                int randomj=(int) (Math.random()*(sala.getColumnas()));
                if(sala.validarAsiento(randomi,randomj) && aux.getAsiento()==""){
                    if(aux.getEdad() > sala.getPelicula().getEdadMinima() && aux.getDinero() > precio){
                        aux.setAsiento(Integer.toString(randomi+1)+sala.getLetraColumna()[randomj]);
                        sala.getAsientos().put((Integer.toString(randomi+1)+sala.getLetraColumna()[randomj]),true);
                        System.out.println("Espectador Importado con Exito...");
                    }
                }
                
            }
        }
        
    }
    public void ingresarPelicula(){
        System.out.print("Ingrese el Nombre de la Película: ");
        String nombre=leer.next();
        System.out.print("Ingrese el Nombre de Director: ");
        String director=leer.next();
        System.out.print("Ingrese la Duración: ");
        float duracion=leer.nextFloat();    
        System.out.print("Ingrese la Edad Mínima Permitida: ");
        int edad=leer.nextInt();
        
        peliculas.add(new Pelicula(nombre, director, duracion, edad));
    }
    
    
    @Override
    public String toString() {
        return "Cine{" + "\n"+"Peliculas:" + "\n"+peliculas + "\n"+ "Sala:" + "\n"+sala + "\n" +"Precio: " + String.format("%.2f", precio) +" USD"+ '}';
    }
    
    
}
