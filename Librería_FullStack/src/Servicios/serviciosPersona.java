/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void asignarPerro(ArrayList<Persona> personas, ArrayList<Perro> perros){
        
        int contadorPerros=0;
        String idPersona="";
        boolean asignado=false;
        
        System.out.println("..:: ASIGNACION DE PERROS ::..");
        System.out.print("Ingrese la identificación de la Persona: ");
        String numeroDni = leer.next();
        
        System.out.println("..:: LISTADO DE PERROS ::..");
        //System.out.println(perros.toString());
        
        for(Perro aux:perros){
            System.out.println(("["+ (contadorPerros+1) + "] "+aux.toString()));
            contadorPerros++;
        }
        System.out.print("Elija el Perro a asignar: ");
        
        int idPerro= leer.nextInt();
        
        for(Persona aux:personas){
            if(aux.getDni().getNumero().equals(numeroDni) && aux.getPerro().getNombre() == null){
                aux.setPerro(perros.get(idPerro-1));
                System.out.println("Perro Asignado!!");
                idPersona=aux.getDni().getNumero();
                perros.remove(idPerro-1);
                asignado=true;
            }else{
                asignado=false;
            }
               
        }
        if(asignado){
            System.out.println("La persona con ID: "+idPersona+" ya tiene asignada un Perro");
        }
        
    }
}
