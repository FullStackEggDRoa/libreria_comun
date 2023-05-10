/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author droa
 */

@Entity
@Table(name = "autor")
public class Autor {
    //Atributos
    @Id
    @Column(name = "idautor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, name = "nombre")
    private String nombre;
    @Column(name= "alta")    
    private Boolean alta;
 
    //Contrusctores

    public Autor() {
        this.alta = true;
    }

    public Autor(Integer id, String nombre, Boolean alta) {
        
        this.id = id;
        this.nombre = nombre;
        this.alta = true;
    }
    
    // Metodos
    //Getter and Setters
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        
        String formatoId = id==null ? "" : String.format("%6.6s",id.toString())+"|";
        String formatoNombre = nombre==null ? "" :String.format("%31.31s",nombre)+"|";        
        
        return formatoId + formatoNombre + "\n";
       
    }
    
    
}

