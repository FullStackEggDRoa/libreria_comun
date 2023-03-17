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
public abstract class Embarcacion implements calculosEmbarcaciones {
    //Atributos
    protected String matricula;
    protected float eslora;
    protected int anio;
    
    //Constructor

    public Embarcacion() {
    }

    public Embarcacion(String matricula, float eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public abstract int calcularModuloFinal(int moduloNormal);

  
    
}
