/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosTelevisor {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    serviciosElectrodomestico sE = new serviciosElectrodomestico();
    
    public Televisor crearTelevisor(){
        
        Electrodomestico e1 = sE.crearElectrodomestico();
        System.out.print("Ingrese la resolución del Televisor (plg): ");  
        float resolucion=leer.nextFloat();        
        System.out.print("El televisor tiene TDT? (Si | No): ");
        String tdtrespuesta = leer.next();
        boolean tdt = tdtrespuesta.equalsIgnoreCase(tdtrespuesta);
        return new Televisor(resolucion,tdt , e1.getPrecio(), e1.getIndiceColor(), e1.getConsumoEnergeticoIndice(), e1.getPeso());
        
    }
}
