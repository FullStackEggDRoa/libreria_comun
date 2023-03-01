/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author droa
 */
public class SalaCine {
     // Atributos
    private int filas;
    private int columnas;
    private Pelicula pelicula;
    private final char[] letraColumna = {'A','B','C','D','E','F','H','I','J','K'};
    private HashMap<CharSequence,Boolean> asientos=new HashMap<>();
    private ArrayList<Espectador> espectadores;
    // Constructores

    public SalaCine(int filas, int columnas,Pelicula pelicula,ArrayList<Espectador> espectadores) {
        this.filas = filas;
        this.columnas = columnas;
        this.espectadores = espectadores;
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                asientos.put(Integer.toString(i+1)+letraColumna[j], false);
            }
        }
        
        
    }
    
    //Métodos

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public HashMap<CharSequence, Boolean> getAsientos() {
        return asientos;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public char[] getLetraColumna() {
        return letraColumna;
    }

    
    
    
    @Override
    public String toString() {
        //Collections.sort(asientos, c);
        return "SalaCine[" + "\n"+"Asientos: " + asientos + ']';
    }
    public boolean validarAsiento(int i,int j){
        boolean respuesta;
        ;
        if(asientos.get(Integer.toString(i+1)+letraColumna[j]).booleanValue()){
            respuesta=false;
        }else{
            respuesta=true;
        }
        
        return respuesta;        
    }
    
    public void mostrarSala(){
        System.out.println("..:: TABLA DE SALA ::.."+"\n");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(Integer.toString(i+1)+letraColumna[j]);
                if(asientos.get(Integer.toString(i+1)+letraColumna[j]).booleanValue()){
                    System.out.print("x"+"\t");
                }else{
                    System.out.print("-"+"\t");
                }
                
            }
            System.out.println("\n");
        }
    }
    
}
