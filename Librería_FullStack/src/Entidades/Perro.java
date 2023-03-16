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
public class Perro extends Animal {
    
    //Atributos
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    private int energia;
    
    //Constructores

    public Perro() {
    }
    
    public Perro(String nombre, String alimento, int edad,  String razaAnimal) {
        super(alimento,razaAnimal);
        this.nombre = nombre;
        this.edad = edad;
        
    }

   
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        //return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}' +"\n";
        return String.format("%10.15s",nombre) + "\t" + String.format("%10.15s",raza) + "\t" + edad + " Años\t" + tamanio +"\n";
    }
    
    public void hacerRuido(){
        System.out.println("Wau!!");
    }
    
    @Override
    public Animal procrear() {
        
        return new Perro();
    }
    
    @Override
    public void Alimentarse() {
       System.out.println("El Perro "+ nombre +" se alimenta de: "+alimento);
    }
    
}
