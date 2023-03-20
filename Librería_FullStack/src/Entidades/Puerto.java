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
    private ArrayList<Amarre> alquileres=new ArrayList<>();
    private float precioParcial;
    
    //Constructores

    public Puerto() {
    }

    public Puerto(ArrayList<Amarre> alquileres, float precioParcial) {
        this.alquileres = alquileres;
        this.precioParcial = precioParcial;
    }
    
    //Métodos

    public ArrayList<Amarre> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Amarre> alquileres) {
        this.alquileres = alquileres;
    }

    public float getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(float precioParcial) {
        this.precioParcial = precioParcial;
    }
    
    
    
    
    public void calcularAlquiler(){
    
        for(Amarre aux: alquileres){
            
            long diaFinalMs=aux.getFechaDevolucion().getTime();
            long diaInicalMs=aux.getFechaAlquiler().getTime();
            long diferenciaDiasMs=diaFinalMs-diaInicalMs;
            int numeroDias=(int) TimeUnit.DAYS.convert(diferenciaDiasMs,TimeUnit.MILLISECONDS);
            
            float precioUnitarioNormal=numeroDias*10*aux.getEmbarcacion().getEslora();
            float precioTotalFinal=precioUnitarioNormal+aux.getEmbarcacion().calcularModuloFinal(numeroDias);
            System.out.println("Posición: "+aux.getPosicion()+" \t"+aux.getEmbarcacion().getClass().getSimpleName()+" -> "+" Precio: "+String.format("%.2f",precioTotalFinal)+" USD");
        }
    
    }
    
    
    
}
