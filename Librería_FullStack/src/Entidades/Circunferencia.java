/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Circunferencia extends Forma{
    // Atributos
    private Double radio;
    
    // Constructuroes

    public Circunferencia() {
    }
    
    public Circunferencia(Double radio) {
        this.radio = radio;
    }
    
    // Métodos

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea() {
        double area_aux= this.PI* Math.pow(radio, (double)2);
        System.out.println("El Area de la Circunferencia es: "+area_aux);
    }

     @Override
    public void calcularPerimetro() {
        double perimetro_aux=2 * this.PI * radio;
        System.out.println("El Perímetro de la Circunferencia es: "+perimetro_aux);
    }
    
}
