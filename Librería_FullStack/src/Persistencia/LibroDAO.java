/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author droa
 */
public class LibroDAO {
    //Atributos
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibreriaDB_PU");
    private EntityManager em = EMF.createEntityManager();
    
    public void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }
    
    public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
    public List<Libro> listarLibros(String queryPsql) throws Exception {
        conectar();
        List<Libro> autores = em.createQuery(queryPsql).getResultList();
        desconectar();
        return autores;
    }
    
    public void guardarLibro(Libro libro){
        conectar();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        desconectar();
    }
    public void editarLibro(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        desconectar();
    }
}
