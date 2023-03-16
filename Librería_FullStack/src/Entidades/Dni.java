/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Dni {
    
    private char serie;
    private String numero;

    public Dni() {
    }

    public Dni(char serie, String numero) {
        this.serie = serie;
        this.numero = numero;
    }
    
    
    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        //return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
        return numero +"\t";
    }
    
    
    
}
