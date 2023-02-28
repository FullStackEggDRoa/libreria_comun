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
public class Juego {
    //Atributos
    
    private ArrayList <JugadorRuleta> jugadores;
    private RevolverDeAgua revolver;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    //Constructores

    public Juego() {
    }

    public Juego(ArrayList<JugadorRuleta> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    //Metodos

    public ArrayList<JugadorRuleta> getJugadores() {
        return jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }
    
    
    
    public void llenarJuego(ArrayList<JugadorRuleta> jugadores, RevolverDeAgua r){
        this.jugadores = jugadores;
        this.revolver = r;
    }
    
    public void ronda(){
        Boolean fin=true;
        do{
            for(JugadorRuleta Aux: jugadores){
                System.out.println(Aux.getNombre());
                if(Aux.disparo(revolver)){
                    fin=false;
                    break;
                }else{
                    System.out.println("Jugador a Salvo. Siguiente: [Si | No]: ");

                    if(leer.next().equalsIgnoreCase("Si")){

                    }else{
                        fin=false;
                        break;
                    }
                }

            }
            System.out.println("Jugador Caido .:: FIN DEL JUEGO ::..");
        }while(fin);
    }
}
