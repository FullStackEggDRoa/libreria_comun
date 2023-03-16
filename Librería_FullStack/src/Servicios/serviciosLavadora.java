/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosLavadora {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    serviciosElectrodomestico sE = new serviciosElectrodomestico();
    
    public Lavadora crearLavadora(){
        
        Electrodomestico e1 = sE.crearElectrodomestico();
        System.out.print("Ingrese la Carga de la Lavadora: ");  
        float carga=leer.nextFloat();        
        return new Lavadora(carga, e1.getPrecio(), e1.getIndiceColor(), e1.getConsumoEnergeticoIndice(), e1.getPeso());
        
    }
    
    
}
