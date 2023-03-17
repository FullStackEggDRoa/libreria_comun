/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author droa
 */
public class Puerto {
    
    //Atributos
    private ArrayList<Amarre> alquileres;
    private float precioParcial;
    
    //Métodos
    
    public void calcularAlquilerNormal(){
    
        for(Amarre aux: alquileres){
            
            long diaFinalMs=aux.getFechaDevolucion().getTime();
            long diaInicalMs=aux.getFechaAlquiler().getTime();
            long diferenciaDiasMs=diaFinalMs-diaInicalMs;
            int numeroDias=(int) TimeUnit.DAYS.convert(diferenciaDiasMs,TimeUnit.MILLISECONDS);
            
            precioParcial=numeroDias*10*aux.getEmbarcacion().getEslora();
            
        }
    
    }
    
    
}
