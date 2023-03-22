/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Barco;
import Entidades.Embarcacion;
import Entidades.Velero;
import Entidades.Yate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosEmbarcacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Embarcacion crearEmbarcaciones(){
        
        System.out.println("..:: INRGRESO NUEVA EMBARCACION ::..");
        Class<?>[] tiposEmbaraciones = Embarcacion.class.getClasses();
        System.out.print("Ingrese el Tipo de Embarcación: [1. Velero | 2. Barco | 3. Yate]");
        int tipoEmbarcacion = leer.nextInt();
        System.out.print("Ingrese la Matricula de la embarcación: ");
        String matricula = leer.next();
        System.out.print("Ingrese la Año de Fabricación de la embarcación: ");
        int anio = leer.nextInt();
        System.out.print("Ingrese la Eslora de la embarcación: ");
        int eslora = leer.nextInt();
        
        switch (tipoEmbarcacion) {
            case 1 -> {
                System.out.print("Ingrese la Cantidad de Mastiles: ");
                int numeroMastiles = leer.nextInt();
                return new Velero(numeroMastiles, matricula, eslora, anio);
            }
            case 2 -> {
                System.out.print("Ingrese los Caballos de Vapor: ");
                int cv = leer.nextInt();
                
                return new Barco(cv, matricula, tipoEmbarcacion, tipoEmbarcacion);
                    
            }
            case 3 -> return new Yate(tipoEmbarcacion, tipoEmbarcacion, matricula, tipoEmbarcacion, tipoEmbarcacion);
            default -> System.out.println("Embaración no Existente");
        }
        
        return new Embarcacion();
    }  
    
}
