/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author droa
 */
public class Producto {
    // Atributos
    private int codigo;
    private String nombre;
    private double precio;
    private int codigoFabricante;
    
    //Constructores

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }
    
    //Metodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    @Override
    public String toString() {
        String formatoCodigo = codigo==0 ? "" : (codigo+"|");
        String formatoNombre = nombre==null ? "" :(nombre+"|");
        String formatoPrecio = precio==0 ? "" : (precio+"|");
        String formatoCodigoFabricante = codigoFabricante==0 ? "" : (codigoFabricante+"|");
        
        return formatoCodigo + formatoNombre + formatoPrecio + formatoCodigoFabricante + "\n";
    }
    
    
}
