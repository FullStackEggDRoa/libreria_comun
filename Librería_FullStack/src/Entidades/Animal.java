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
public abstract class Animal implements accionesAnimal {
    
    // Atributos
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razaAnimal;
    
    // Constructores

    public Animal() {
    }

    public Animal(String alimento, String razaAnimal) {
        
        this.alimento = alimento;
        this.razaAnimal = razaAnimal;
    }

    public Animal(String nombre, String alimento, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }
   
    // Métodos
    public void hacerRuido(){
        
        System.out.println("Hola");
        
    }
   
    public abstract void Alimentarse();

    @Override
    public abstract Animal procrear();
    
    @Override
    public Animal comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
