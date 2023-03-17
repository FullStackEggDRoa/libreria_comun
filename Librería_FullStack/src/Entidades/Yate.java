/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Yate extends Embarcacion{
    
    //Atributos
    
    private int cv;
    private int numeroCamarotes;
    
    //Constructores

    public Yate() {
    }

 
    public Yate(int cv, int numeroCamarotes, String matricula, float eslora, int anio) {
        super(matricula, eslora, anio);
        this.cv = cv;
        this.numeroCamarotes = numeroCamarotes;
    }

    //Métodos

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public int calcularModuloFinal(int moduloNormal) {
        int moduloFinal=moduloNormal+this.cv+this.numeroCamarotes;
        
        return moduloFinal;
    }
    
    
    
}
