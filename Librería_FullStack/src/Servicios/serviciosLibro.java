/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.LibroDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
        
        libro.setTitulo(nombreLibro);
        libro.setIsbn(isbn);
        libro.setAnio(anio);
        libro.setAutor(sA.buscarAutor());
        libro.setEditorial(sE.buscarEditorial());
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
    
    public List<Libro> listarLibrosAutor(Autor autor){
    
        try {
            String queryPsql = "SELECT l FROM Libro l WHERE l.autor.id = '"+autor.getId()+"'";
            return DAO.listarLibros(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Libro> listarLibrosEditorial(Editorial editorial){
    
        try {
            String queryPsql = "SELECT l FROM Libro l WHERE l.editorial.id = '"+editorial.getId()+"'";
            return DAO.listarLibros(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Libro> listarLibrosIsbn(Long isbn){
    
        try {
            String queryPsql = "SELECT l FROM Libro l WHERE l.isbn LIKE '%"+isbn+"%'";
            return DAO.listarLibros(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Libro> listarLibrosTitulo(String titulo){
    
        try {
            String queryPsql = "SELECT l FROM Libro l WHERE l.titulo LIKE '%"+titulo+"%'";
            return DAO.listarLibros(queryPsql);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Libro> listarLibrosInventarios(int id){
        
        try {
            String queryPsql = "SELECT l FROM Libro l WHERE l.id = '"+id+"'";
            return DAO.listarLibros(queryPsql);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
    public void editarLibro(){
        
        Libro libro = new Libro();
        System.out.println(".:: Editar Producto ::..");
        try{
            List<Libro> nombreLibros = new ArrayList<>();
//            servicios_Fabricante sF = new servicios_Fabricante();
            int contadorAutor = 1;
            int contadorEditorial = 1;
            String nombreAutor = "";
            String nombreEditorial = "";
            String queryPsql="";
            
            System.out.print("Ingrese el Codigo de Libro: ");
            int codigoLibro = leer.nextInt();
            nombreLibros=DAO.listarLibros("SELECT l FROM Libro l WHERE l.id="+codigoLibro);
            for(Libro auxLibro : nombreLibros){
                System.out.print("Editar Titulo de Libro ["+auxLibro.getTitulo()+"]: ");
                auxLibro.setTitulo(leer.next());
                System.out.print("Editar ISBN ["+auxLibro.getIsbn()+"]: ");
                auxLibro.setIsbn(leer.nextLong());
                do{
                    String comanda = "[";
                    for(Autor auxAutor : sA.listarAutores()){

                        comanda+=contadorAutor+". "+auxAutor.getNombre()+" | ";
                        contadorAutor++;
                        try{
                            if(Objects.equals(auxAutor.getId(), auxLibro.getAutor().getId())){
                               nombreAutor = auxAutor.getNombre();
                            }else{
                                nombreAutor = "No Asignado";
                            }
                        }catch(Exception e){
                            nombreAutor = "No Asignado";
                        }
                    }
                    System.out.print("Editar Autor ["+nombreAutor+"]\n"+comanda+"]\n ["+contadorAutor+". Ingresar Nuevo Autor]: ");
                    int seleccion = leer.nextInt();
                    
                    if(seleccion < contadorAutor){
                        auxLibro.setAutor(sA.listarAutores().get(seleccion-1));
                        contadorAutor=0;
                        DAO.editarLibro(auxLibro);

                    }else{
                        sA.crearAutor();
                        contadorAutor=1;
                    }
                    
                }while(contadorAutor!=0);
                
                do{
                    String comanda = "[";
                    for(Editorial auxEditorial : sE.listarEditoriales()){

                        comanda+=contadorEditorial+". "+auxEditorial.getNombre()+" | ";
                        contadorEditorial++;
                        try{
                            if(Objects.equals(auxEditorial.getId(), auxLibro.getEditorial().getId())){
                               nombreEditorial = auxEditorial.getNombre();
                            }else{
                                nombreEditorial = "No Asignado";
                            }
                        }catch(Exception e){
                            nombreEditorial = "No Asignado";
                        }
                    }
                    System.out.print("Editar Editorial ["+nombreEditorial+"]\n"+comanda+"]\n ["+contadorEditorial+". Ingresar Nueva Editorial]: ");
                    int seleccion = leer.nextInt();
                    
                    if(seleccion < contadorEditorial){
                        auxLibro.setEditorial(sE.listarEditoriales().get(seleccion-1));
                        contadorEditorial=0;
                        DAO.editarLibro(auxLibro);

                    }else{
                        sE.crearEditorial();
                        contadorEditorial=1;
                    }
                    
                }while(contadorEditorial!=0);
                
                

            }
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}

