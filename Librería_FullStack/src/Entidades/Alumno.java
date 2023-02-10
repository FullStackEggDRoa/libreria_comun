/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class Alumno {
    // Atributos
    private String nombre;
    private ArrayList<Integer> notas; 
    
    // Constructores

    public Alumno() {
    }
    
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    // Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    // Propios
    
    public void calcularNotaFinal(){
        float sumatoria = 0;
        for (int i=0;i<notas.size();i++){
            sumatoria+=(int)notas.get(i);
        }
        System.out.println("El promedio Final es: "+String.format("%.4g",sumatoria/notas.size()));        
    }
    
}
