/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author droa
 */
public class Cine {
    //Atributos
    private ArrayList <Pelicula> peliculas;
    private SalaCine sala;
    private float precio;
    
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
        int randomi=(int) (Math.random()*(sala.getFilas()-1));
        int randomj=(int) (Math.random()*(sala.getColumnas()-1));
        
        if(!sala.getEspectadores().isEmpty()){
            for(Espectador aux : sala.getEspectadores()){
                if(sala.validarAsiento(randomi,randomj)){
                    if(aux.getEdad() > sala.getPelicula().getEdadMinima() && aux.getDinero() > precio){
                        aux.setAsiento(Integer.toString(randomi+1)+sala.getLetraColumna()[randomj]);
                        sala.getAsientos().put((Integer.toString(randomi+1)+sala.getLetraColumna()[randomj]),true);
                        System.out.println("Espectador Importado con Exito...");
                    }
                }
                
            }
        }
        
    }
    
    @Override
    public String toString() {
        return "Cine{" + "\n"+"Peliculas:" + "\n"+peliculas + "\n"+ "Sala:" + "\n"+sala + "\n" +"Precio: " + String.format("%.2f", precio) +" USD"+ '}';
    }
    
    
}
