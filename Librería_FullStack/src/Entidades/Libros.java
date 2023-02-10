package Entidades;

import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author droa
 */
public class Libros {
     // Atributos
    // ISBN, Título, Autor,Número de páginas
    
    private String ISBN; //ISBN contiene guiones. Ej: 978-3-16-148410-0
    private String titulo;
    private String autor;
    private int numeroPag;

    public Libros(String ISBN, String titulo, String autor, int numeroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    
    }

    
    //getters
    public Libros() {
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }
    
    @Override
    public String toString() {
        return "Libros{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPag=" + numeroPag + '}';
    }
    
    public static Comparator<Libros> compararLibro = new Comparator<Libros>() {
        @Override
        public int compare(Libros l1, Libros l2) {
            Integer aux1= l1.getNumeroPag();
            Integer aux2= l2.getNumeroPag();
            return aux2.compareTo(aux1);
        }
    };
    
}
