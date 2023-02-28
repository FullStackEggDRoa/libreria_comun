/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class JugadorRuleta {
    
    //Atributos
    
    private int id;
    private String nombre;
    private boolean mojado;
    
    //Constructores

    public JugadorRuleta() {
        
    }

    public JugadorRuleta(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    //Métodos

    public String getNombre() {
        return nombre;
    }
    
    
    
    public boolean disparo(RevolverDeAgua r){
        boolean respuesta=false;
        
        this.mojado = r.mojar();
        r.siguienteChorro();
        if(mojado){
            respuesta=true;
        }
        return respuesta;
    }

    @Override
    public String toString() {
        return "JugadorRuleta{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}'+"\n";
    }
    
    
    
}
