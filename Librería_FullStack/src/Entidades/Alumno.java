/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author droa
 */
public class Alumno {
    // Atributos
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fechaNacimiento;
    private ArrayList<Integer> notas; 
    public static final String[] nacionalidades = {"ARGENTINA","CHILENA","VENEZOLANA"};
    
    // Constructores

    public Alumno() {
    }
    
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno(String nombre, String apellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;    
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getter

    public String getNacionalidad() {
        return nacionalidad;
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
