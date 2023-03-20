/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author droa
 */
public class Amarre {
    //Atributos
    private String nombre;
    private Dni documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicion;
    private Embarcacion embarcacion;

    public Amarre() {
    }

    public Amarre(String nombre, Dni documento, Date fechaAlquiler, Date fechaDevolucion, int posicion, Embarcacion embarcacion) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.embarcacion = embarcacion;
    }
    
    
    
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dni getDocumento() {
        return documento;
    }

    public void setDocumento(Dni documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Embarcacion getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Embarcacion embarcacion) {
        this.embarcacion = embarcacion;
    }
    
    
    
}
