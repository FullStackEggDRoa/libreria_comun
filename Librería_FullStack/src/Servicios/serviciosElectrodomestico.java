/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author droa
 */

public class serviciosElectrodomestico {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Electrodomestico crearElectrodomestico(){
        System.out.println("..:: CREAR ELECTRODOMESTICO ::..");
        System.out.print("Ingrese el Color: ");
        CharSequence Color = leer.next();
        System.out.print("Ingrese la letra Consumo Energético: ");
        char letra = leer.next().charAt(0);
         System.out.print("Ingrese el Peso: ");
        float peso = leer.nextFloat();
        Electrodomestico e1 = new Electrodomestico(1000,0,5,peso);
        int indiceColor=e1.comprobarColor(Color);
        int indiceConsumoEnergetico=e1.comprobarConsumoEnergetico(letra);
        e1.setIndiceColor(indiceColor);
        e1.setConsumoEnergeticoIndice(indiceConsumoEnergetico);
        return e1;
    }
}
