/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Carta {
    //Atributos
    private int numero;
    private char palo;
    
    //Constructores

    public Carta() {
        
    }

    public Carta(int numero, char palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    //Métodos

    @Override
    public String toString() {
        String fila="";
        String cadena="";
        if(numero==1 ){
            fila="Carta[" + "Palo: " + palo + ", Número: " + numero + ']' + "\t";
        }else if(palo=='b') {
            
        }else{
        
        }
        cadena+=fila;
        //return cadena;
        return "Carta[" + "Palo: " + palo + ", Número: " + numero + ']' + "\n";
    }
    
    
}
