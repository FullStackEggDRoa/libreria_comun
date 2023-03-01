/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


/**
 *
 * @author droa
 */
public class Pelicula {
    //Atritbutos
    private String titulo;
    private String director;
    private float duracionHoras;
    private int edadMinima;
    
    // Constructores

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, float duracionHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
        
    }

    public Pelicula(String titulo, String director, float duracionHoras, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
        this.edadMinima = edadMinima;
    }
    
    
    
    // Métodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    
    @Override
    
    public String toString() {
        return "Titulo: " + titulo + "\t\t" +"Director: " + director + "\t\t" + "Duración: " + duracionHoras +" Horas" +"\n";
    }
    
    
    
}
