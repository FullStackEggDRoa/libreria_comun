/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Circunferencia;
import Interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosCircunferencia {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Math operador
    
    public Circunferencia crearCircunferencia(){
        System.out.print("Ingrese el radio de la Circunferencia: "); 
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
      
    }
    
    public void calcularArea(Circunferencia cir) {
        double area_aux= cir.PI * Math.pow(cir.getRadio(), (double)2);
        System.out.println("El Area de la Circunferencia es: "+String.format("%.3f",area_aux));
    }

    public void calcularPerimetro(Circunferencia cir) {
        double perimetro_aux=2*cir.PI*cir.getRadio();
        System.out.println("El Area de la Circunferencia es: "+String.format("%3.f",perimetro_aux));
    }
    
}
