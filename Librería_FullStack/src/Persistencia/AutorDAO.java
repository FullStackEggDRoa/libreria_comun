/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.persistence.RollbackException;

/**
 *
 * @author droa
 */
public class AutorDAO {
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
    
    public List<Autor> listarAutores(String queryPsql) throws Exception {
        conectar();
        List<Autor> autores = em.createQuery(queryPsql).getResultList();
        desconectar();
        return autores;
    }
    
    public void guardarAutor(Autor autor) throws Exception{
        try {
            conectar();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        desconectar();
        } catch (RollbackException e) {
            throw e;
        } finally{
            desconectar();
        }
        
    }
    
}
