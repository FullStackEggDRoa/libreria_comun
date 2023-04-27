/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Persistencia.AutorDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosAutor {
    
    //Atributos
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final AutorDAO DAO;

    public serviciosAutor() {
       this.DAO = new AutorDAO();
    }
    
    public void crearAutor(){
        Autor autor = new Autor();
        System.out.println(".:: INGRESO AUTOR ::..");
        System.out.print("Ingrese Nombre del Autor: ");
        String nombreAutor = leer.next();
        autor.setNombre(nombreAutor);
        DAO.guardarAutor(autor);
    }
    
    public List<Autor> listarAutores(){
    
        try {
            return DAO.listarAutores();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
