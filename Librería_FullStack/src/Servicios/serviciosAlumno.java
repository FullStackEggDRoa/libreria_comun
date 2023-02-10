/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosAlumno {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAlumno(ArrayList<Alumno> al){
        boolean respuesta=false;
        String nombre;
        ArrayList <Integer> notas = new ArrayList<Integer>();
        System.out.println("Ingreso Alumnos: ");
        
        do{
            System.out.print("Ingrese el Nombre del Alumno: ");
            nombre = leer.next();
            for(int i=0;i<3;i++){
                System.out.print("Ingresa Nota No. "+(i+1)+": ");
                notas.add(leer.nextInt());
            }
            System.out.print("Desea Ingresar otro Alumno? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
            al.add(new Alumno(nombre,notas));
       
        }while(respuesta);
        
    }
    
    public void notaFinal(ArrayList<Alumno> al){
        System.out.println("Calculo de Nota Final: ");
        System.out.print("Ingrese el Nombre del Alumno:");
        String nombre = leer.next();
        for(Alumno alumnoAux : al){
            if(alumnoAux.getNombre().equals(nombre)){
                alumnoAux.calcularNotaFinal();     
            }
        }
    } 
    
}
