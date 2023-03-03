/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

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
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ///Colores String Outs
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    // Constructores

    public SalaCine(int filas, int columnas,Pelicula pelicula,ArrayList<Espectador> espectadores) {
        this.filas = filas;
        this.columnas = columnas;
        this.pelicula = pelicula;
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
        
        if(asientos.get(Integer.toString(i+1)+letraColumna[j]).booleanValue()){
            respuesta=false;
        }else{
            respuesta=true;
        }
        
        return respuesta;        
    }
    
    public void mostrarSala(){
        
        System.out.println("");
        System.out.println(ANSI_PURPLE+"..:: TABLA DE SALA ::.."+ANSI_RESET+"\n");
        System.out.println(ANSI_YELLOW+"Sala No. 1"+ANSI_RESET);
        System.out.println(ANSI_CYAN+"Pelicula: "+ANSI_RESET+pelicula.getTitulo());
        System.out.println("");
        
        for(int i=filas-1;i>=0;i--){
            for(int j=0;j<columnas;j++){
                System.out.print(Integer.toString(i+1)+letraColumna[j]);
                if(asientos.get(Integer.toString(i+1)+letraColumna[j]).booleanValue()){
                    System.out.print(ANSI_RED+"x"+ANSI_RESET+"\t");
                }else{
                    System.out.print(ANSI_GREEN+"-"+ANSI_RESET+"\t");
                }
                
            }
            System.out.println("\n");
        }
    }
    
    public void ingresarEspectador(){
        System.out.print("Ingrese el Nombre: ");
        String nombre=leer.next();
        System.out.print("Ingrese la Edad: ");
        int edad=leer.nextInt();
        System.out.print("Ingrese Cantidad Recarga: ");
        float dinero=leer.nextFloat();        
        
        
        espectadores.add(new Espectador(nombre, edad, dinero, ""));
    }
    
}
