/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.calculosEmbarcaciones;

/**
 *
 * @author droa
 */
public class Velero extends Embarcacion{
    
    //Atributos
    private int numeroMastiles;
    
    //Constructores

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, float eslora, int anio) {
        super(matricula, eslora, anio);
        this.numeroMastiles = numeroMastiles;
    }
    
    
    
    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public int calcularModuloFinal(int moduloNormal) {
        int moduloFinal=moduloNormal+this.numeroMastiles;
        
        return moduloFinal;
    }

    

    
    
    
}
