/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.accionesAnimal;

/**
 *
 * @author droa
 */
public class Gato extends Animal{
    //Atributos
    
    //Constructores
    
    public Gato(){
    }

    

    public Gato(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    //Métodos
    @Override
    public void hacerRuido() {
        System.out.println("Miauuu!");
    }
    @Override
    public Animal procrear() {
        
        return new Gato();
    }
    @Override
    public void Alimentarse() {
       System.out.println("El Gato "+ nombre +" se alimenta de: "+alimento);
    }
}
