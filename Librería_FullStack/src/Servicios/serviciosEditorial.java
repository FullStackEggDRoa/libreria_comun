/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosEditorial {
    //Atributos
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final EditorialDAO DAO;

    public serviciosEditorial() {
       this.DAO = new EditorialDAO();
    }
    
    public void crearEditorial(){
        Editorial editorial = new Editorial();
        System.out.println(".:: INGRESO Editorial ::..");
        System.out.print("Ingrese Nombre de la Editorial: ");
        String nombreEditorial = leer.next();
        editorial.setNombre(nombreEditorial);
        DAO.guardarEditorial(editorial);
    }
    
    public List<Editorial> listarAutores(){
    
        try {
            String queryPsql = "SELECT e FROM Editorial e";
            return DAO.listarEditorial(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
