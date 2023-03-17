/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Barco extends Embarcacion {
    
    //Atributos
    
    private int cv;
    
    // Constructor

    public Barco() {
    }

    public Barco(int cv, String matricula, float eslora, int anio) {
        super(matricula, eslora, anio);
        this.cv = cv;
    }
    
    //Métodos

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public int calcularModuloFinal(int moduloNormal) {
        int moduloFinal=moduloNormal+this.cv;
        
        return moduloFinal;
    }
    
    
    
    
}
