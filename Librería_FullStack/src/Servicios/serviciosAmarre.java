/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Amarre;
import Entidades.Barco;
import Entidades.Dni;
import Entidades.Embarcacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosAmarre {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public Amarre alquilerAmarre (ArrayList<Amarre> alquileres) throws ParseException{
        
        boolean matriculaOk=false;
        boolean identificacionOk=false;
        
        String matricula="";
        String documentoString="";
        String fechaDevolucionString="";
        Date fechaAlquiler = new Date(System.currentTimeMillis());
        Date fechaDevolucion = new Date();
        int numeroPuerto=0;
        Embarcacion embarcacion=new Barco();
        Dni identificacion= new Dni();
        
        
        System.out.println("..::Alquiler Amarre ::..");
        System.out.print("Ingrese Matricula Embarcación: ");
        matricula= leer.next();
        
        for(Amarre aux : alquileres){
            if(aux.getEmbarcacion().getMatricula().equals(matricula)){
                System.out.print("Ingrese identificación Usuario: ");
                documentoString= leer.next(); 
                embarcacion=aux.getEmbarcacion();
                               
                matriculaOk=true;    
            }else{
                embarcacion=sE.crearEmbarcacion();
                matriculaOk=false;
            }    
        }
        for(Amarre aux : alquileres){
            if(aux.getDocumento().getNumero().equals(documentoString)){
                System.out.print("Ingrese Fecha de Devolución [DD-MM-AAAA]: ");
                fechaDevolucionString = leer.next();
                identificacion=aux.getDocumento();
                identificacionOk=true;
                    
           }else{
                identificacionOk=false;
            }
        }
        
        if(matriculaOk && identificacionOk){
            
//            DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            LocalDate fechaDevolucionAux=LocalDate.parse(fechaDevolucionString, formato);
//            
            fechaDevolucion=new SimpleDateFormat("dd-MM-yyyy").parse(fechaDevolucionString);
            System.out.print("Ingrese el Número de Puerto: ");
            numeroPuerto=leer.nextInt();
            
        }
        
        
        return new Amarre(matricula,identificacion , fechaAlquiler, fechaDevolucion, numeroPuerto, embarcacion);
    }
    
    
}
