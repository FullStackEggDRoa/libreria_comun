/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author droa
 */
public class EditorialDAO {
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
    
    public List<Editorial> listarEditoriales(String queryPsql) throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery(queryPsql).getResultList();
        desconectar();
        return editoriales;
    }
    
    public void guardarEditorial(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        desconectar();
    }
}
