/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Lavadora extends Electrodomestico{
    
//Atributos
    private float carga;
    
    //Constructores

    public Lavadora() {
    }

    public Lavadora(float carga, float precio, int indiceColor, int consumoEnergeticoIndice, float peso) {
        super(precio, indiceColor, consumoEnergeticoIndice, peso);
        this.carga = carga;
    }
    
    // Métodos

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if(this.carga>30){
            this.precio+=500;
        }
        
    }
    
    
    
    
}
