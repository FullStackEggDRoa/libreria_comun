/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Electrodomestico {
    
    //Atributos
    protected float precio;
    protected int indiceColor;
    protected int consumoEnergeticoIndice;
    protected float peso;
    
    protected final char[] consumoEnergetico={'A','B','C','D','E','F'};
    protected final int[] precioEnergiaPlus={1000,800,600,500,300,100};
    protected final CharSequence[] colores={"Blanco","Negro","Rojo","Azul"};
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Consructores
    public Electrodomestico() {
        this.consumoEnergeticoIndice=comprobarConsumoEnergetico('F');
        this.indiceColor=comprobarColor("Blanco");
    }
    
    public Electrodomestico(float precio, int indiceColor, int consumoEnergeticoIndice,float peso) {
        this.precio = precio;       
        this.peso = peso;
        this.consumoEnergeticoIndice=comprobarConsumoEnergetico(consumoEnergetico[consumoEnergeticoIndice]);
        this.indiceColor=comprobarColor(colores[indiceColor]);
    }

    //Métodos

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getIndiceColor() {
        return indiceColor;
    }

    public void setIndiceColor(int indiceColor) {
        this.indiceColor = indiceColor;
    }

    

    public int getConsumoEnergeticoIndice() {
        return consumoEnergeticoIndice;
    }

    public void setConsumoEnergeticoIndice(int consumoEnergeticoIndice) {
        this.consumoEnergeticoIndice = consumoEnergeticoIndice;
    }

    
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public int comprobarConsumoEnergetico(char letra){
        int respuesta;
        
        switch (letra) {
                
            case 'A' -> respuesta=0;
            case 'B' -> respuesta=1;
            case 'C' -> respuesta=2;
            case 'D' -> respuesta=3;
            case 'E' -> respuesta=4;
            case 'F' -> respuesta=5;
            default -> respuesta=5;
        }
        return respuesta;
        
    }
    
    public int comprobarColor(CharSequence color){
        int respuesta;
        
        String minusculas = color.toString().toLowerCase();
        
        switch (minusculas) {
                
            case "blanco" -> respuesta=0;
            case "negro" -> respuesta=1;
            case "azul" -> respuesta=2;
            case "gris" -> respuesta=3;
            default -> respuesta=0;
        }
        return respuesta;
    
    }
    
//    public Electrodomestico crearElectrodomestico(){
//        System.out.println("..:: CREAR ELECTRODOMESTICO ::..");
//        System.out.print("Ingrese el Color :");
//        CharSequence Color = leer.next();
//        System.out.println("Ingrese la letra Consumo Energético: ");
//        char letra = leer.next().charAt(0);
//         System.out.print("Ingrese el Peso: ");
//        float peso = leer.nextFloat();
//        
//        return new Electrodomestico(1000,comprobarColor(Color),comprobarConsumoEnergetico(letra),peso);
//    }
    
    public void precioFinal(){
        if(this.peso >= 1 && this.peso<=19){
            this.precio+=100;
        }else if(this.peso >= 20 && this.peso<=49){
            this.precio+=500;
        }else if(this.peso >= 50 && this.peso<=79){
            this.precio+=800;
        }else if(this.peso>80){
            this.precio+=1000;
        }
        switch(this.consumoEnergeticoIndice){
            case 0 -> this.precio+=precioEnergiaPlus[0];
            case 1 -> this.precio+=precioEnergiaPlus[1];
            case 2 -> this.precio+=precioEnergiaPlus[2];
            case 3 -> this.precio+=precioEnergiaPlus[3];
            case 4 -> this.precio+=precioEnergiaPlus[4];
            case 5 -> this.precio+=precioEnergiaPlus[5]; 
        }
    }
}
    

