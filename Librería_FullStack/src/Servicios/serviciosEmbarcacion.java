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
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosEmbarcacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Embarcacion crearEmbarcacion(){
        
        System.out.println("..:: INGRESO DE NUEVA EMBARCACION ::..");
        var tiposEmbarciones = Embarcacion.class.getNestMembers();
        System.out.print("Ingrese el Tipo de Embarcación: [1. Velero | 2. Barco | 3. Yate]"+Arrays.toString(tiposEmbarciones));
        int tipoEmbarcacion = leer.nextInt();
        System.out.print("Ingrese la Matricula de la embarcación: ");
        String matricula = leer.next();
        System.out.print("Ingrese la Año de Fabricación de la embarcación: ");
        int anio = leer.nextInt();
        System.out.print("Ingrese la Eslora de la embarcación: ");
        int eslora = leer.nextInt();
        
        switch (tipoEmbarcacion) {
            case 1 -> {
                System.out.print("Ingrese la Cantidad de Mástiles: ");
                int numeroMastiles = leer.nextInt();
                return new Velero(numeroMastiles, matricula, eslora, anio);
            }
            case 2 -> {
                System.out.print("Potencia [CV]: ");
                int cv = leer.nextInt();
                
                return new Barco(cv, matricula, eslora, anio);
                    
            }
            case 3 -> {
                System.out.print("Ingrese la Potencia [CV]: ");
                int cv = leer.nextInt();
                System.out.print("Ingrese No. de Camarotes: ");
                int camarotes = leer.nextInt();
                return new Yate(cv,camarotes ,matricula, eslora, anio);

            }
            default -> {
                System.out.println("Embaración no Existente");
                return new Barco(); //
            }
            
        }
        
        
    }  
    
}
