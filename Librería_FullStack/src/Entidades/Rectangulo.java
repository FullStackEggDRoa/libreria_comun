/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author droa
 */
public class Rectangulo extends Forma implements calculosFormas {
    //atributos
    
    private int base;
    private int altura;
    
    // Constructores

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Getter and Setter

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        double area_aux= this.base * this.altura;
        System.out.println("El Area del Rectagulo es: "+area_aux);
    }

     @Override
    public void calcularPerimetro() {
        double perimetro_aux=(this.base + this.altura)*2;
        System.out.println("El Perímetro del Rectangulo: "+perimetro_aux);
    }
    
}
