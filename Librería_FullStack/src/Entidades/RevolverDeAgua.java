/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class RevolverDeAgua {
    // Atributos
    
    private int posicionActual;
    private int posicionAgua;
    
    // Constructores

    public RevolverDeAgua() {
        
        
    }

    // Métodos
    
    public void llenarRevolver(){
        // Sumiento que el tambor tiene 6 balas.
        this.posicionActual=(int)(Math.random()*5+1);
        System.out.println(posicionActual);
        this.posicionAgua=(int)(Math.random()*5+1);
        System.out.println(posicionAgua);
    }
    
    public boolean mojar(){
        Boolean respuesta=false;
        if(posicionActual==posicionAgua){
            respuesta=true;
        }
        return respuesta;
    }
    
    public void siguienteChorro(){
        if(posicionActual>=6){
            posicionActual=1;
        }else{
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
}
