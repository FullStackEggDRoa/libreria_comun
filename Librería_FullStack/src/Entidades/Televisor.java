package Entidades;


import Entidades.Electrodomestico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author droa
 */
public class Televisor extends Electrodomestico{
    //Atributos
    private float resolucion;
    private boolean tdt;
    
    //Constructores

    public Televisor() {
    }

    public Televisor(float resolucion, boolean tdt, float precio, int indiceColor, int consumoEnergeticoIndice, float peso) {
        super(precio, indiceColor, consumoEnergeticoIndice, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if(this.resolucion>40){
            this.precio=this.precio*1.30f;
        }
        if(this.tdt){
            this.precio+=500;
        }
    }
    
    
    
    
}
