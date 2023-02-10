/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libros;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author droa
 */

public class serviciosLibros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libros crearLibro() {
        System.out.print("Ingrese el ISBN: ");
        String ISBN = leer.next();
        System.out.print("Ingrese el titulo: ");
        String titulo = leer.next();
        System.out.print("Ingrese el autor: ");
        String autor = leer.next();
        System.out.print("Ingrese el Número de paginas: ");
        int pag = leer.nextInt();

        return new Libros(ISBN, titulo, autor, pag);

    }

    public void mostrarDatos(Libros libro) {
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("No. de Páginas: " + libro.getNumeroPag());

    }
    
    

}
