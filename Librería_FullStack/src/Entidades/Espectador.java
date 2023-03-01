/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Espectador {
    //Atributos
    private String nombre;
    private int edad;
    private float dinero;
    private CharSequence asiento;
    
    //Constructores

    public Espectador(String nombre, int edad, float dinero, CharSequence asiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.asiento = asiento;
    }
    
    //Métodos

    public CharSequence getAsiento() {
        return asiento;
    }

    public int getEdad() {
        return edad;
    }

    public float getDinero() {
        return dinero;
    }

    public void setAsiento(CharSequence asiento) {
        this.asiento = asiento;
    }
    
    
    
}
