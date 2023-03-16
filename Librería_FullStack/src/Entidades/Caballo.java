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
public class Caballo extends Animal {

    //Atributos
    
    //Constructores
    
    
    
    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    
    
    //Métodos
    
    @Override
    public void hacerRuido() {
        System.out.println("Mrrmmrm!");
    }
    
    
    @Override
    public void Alimentarse() {
        System.out.println("El Caballo "+ nombre +" se alimenta de: "+alimento);
    }

    @Override
    public Animal procrear() {
        return new Caballo();
    }
    
    
    
}
