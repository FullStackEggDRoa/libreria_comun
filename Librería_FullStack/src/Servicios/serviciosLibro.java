/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libro;
import Persistencia.LibroDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosLibro {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    serviciosAutor sA = new serviciosAutor();
    serviciosEditorial sE = new serviciosEditorial();
    
    private final LibroDAO DAO;
    
   public serviciosLibro() {
       this.DAO = new LibroDAO();
    }
    
    public void crearLibro(){
        Libro libro = new Libro();
        System.out.println(".:: INGRESO Libro ::..");
        System.out.print("Ingrese el Titulo del Libro: ");
        String nombreLibro = leer.next();
        System.out.print("Ingrese el ISBN: ");
        Long isbn = leer.nextLong();
        System.out.print("Ingrese el Año: ");
        int anio = leer.nextInt();
        
        libro.setTitutlo(nombreLibro);
        libro.setIsbn(isbn);
        libro.setAnio(anio);
        libro.setAutor(sA.buscarAutor());
        
        DAO.guardarLibro(libro);
    }
    
    public List<Libro> listarLibros(){
    
        try {
            String queryPsql = "SELECT l FROM Libro l";
            return DAO.listarLibros(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}

