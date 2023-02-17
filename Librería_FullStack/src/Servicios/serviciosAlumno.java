/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Date;
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
        System.out.println("Cálculo de Nota Final: ");
        System.out.print("Ingrese el Nombre del Alumno:");
        String nombre = leer.next();
        for(Alumno alumnoAux : al){
            if(alumnoAux.getNombre().equals(nombre)){
                alumnoAux.calcularNotaFinal();     
            }
        }
    }
    public void altaAlumno(ArrayList<Alumno> al){
        boolean respuesta=false;
        String nombre;
        String apellido;
        String nacionalidades="";
        for(String aux : Alumno.nacionalidades){
            nacionalidades+=aux + " | ";
        }
        
        System.out.println("..::Alta Alumnos::.. ");
        
        do{
            System.out.print("Ingrese Nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese Apellido: ");
            apellido = leer.next();
            
            System.out.print("Ingrese Nacionalidad ["+nacionalidades+"]");
            apellido = leer.next(); 
            
            System.out.print("Ingrese Fecha de Nacimiento: ");
            Date fechaNacimiento=new Date();
            
            
            System.out.print("Desea dar de Alta otro Alumno? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
            al.add(new Alumno(nombre,apellido,fechaNacimiento));
       
        }while(respuesta);
    }
    
    public void bajaAlumno(ArrayList<Alumno> al){
        boolean respuesta=false;
        String nombre;
        String apellido;
        String nacionalidades="";
        for(String aux : Alumno.nacionalidades){
            nacionalidades+=aux + " | ";
        }
        
        System.out.println("..::Alta Alumnos::.. ");
        
        do{
            System.out.print("Ingrese Nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese Apellido: ");
            apellido = leer.next();
            
            System.out.print("Ingrese Nacionalidad ["+nacionalidades+"]");
            apellido = leer.next(); 
            
            System.out.print("Ingrese Fecha de Nacimiento: ");
            Date fechaNacimiento=new Date();
            
            
            System.out.print("Desea dar de Alta otro Alumno? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
            al.add(new Alumno(nombre,apellido,fechaNacimiento));
       
        }while(respuesta);
    }
    
}
