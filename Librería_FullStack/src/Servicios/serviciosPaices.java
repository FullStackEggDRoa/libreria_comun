/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosPaices {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPaís(HashSet<String> ps){
        boolean respuesta=false;
        String pais;
        
        System.out.println("Ingreso de País: ");
        
        do{
            System.out.print("Ingrese el Nombre del País: ");
            pais = leer.next();
            
            ps.add(pais);
            
            System.out.print("Desea Ingresar otra País? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
        }while(respuesta);
        
    }
    public void borrarPaís(HashSet<String> ps){
        boolean respuesta=false;
        String pais;
        
        System.out.println("Borrar un País: ");
        
        do{
            System.out.print("Ingrese el Nombre del País a BORRAR: ");
            pais = leer.next();
            try{
                Iterator <String> it = ps.iterator();
                while(it.hasNext()){
                    if(it.next().equals(pais)){
                        it.remove();
                    }
                }
                
            } catch(Exception e){
                System.out.println("El País ingresado no Existe .. Intente nuevamente");
            }
            System.out.print("Desea BORRAR otra Páis? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
        }while(respuesta);
        
    }
    
}
