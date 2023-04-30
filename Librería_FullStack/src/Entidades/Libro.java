/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author droa
 */
@Entity
@Table(name = "libro")
public class Libro {
    
    //Atributos
    @Id
    @Column(name = "idlibro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true,name = "isbn")
    private Long isbn;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "ejemplares")
    private Integer ejemplares;
    @Column(name = "ejemplaresPrestados")
    private Integer ejemplaresPrestados;
    @Column(name = "ejemplaresRestantes")
    private Integer ejemplaresRestantes;
    @Column(name = "alta")
    private Boolean alta;
    //@Column(name = "idautor")
    @OneToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
    //@Column(name = "ideditorial")
    @OneToOne
    @JoinColumn(name = "id_editorial")
    private Editorial editorial;
    
    //Constructores

    public Libro() {
        this.alta=true;
    }

    public Libro(Integer id, Long isbn, String titutlo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titutlo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.alta = true;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    //Métodos
    //Getter and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titutlo) {
        this.titulo = titutlo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        
        String formatoId = id==null ? "" : String.format("%6.6s",id.toString())+"|";
        String formatoTitulo = titulo==null ? String.format("%31.31s","-")+"|" :String.format("%31.31s",titulo)+"|";
        String formatoIsbn = isbn==null ? String.format("%31.31s","-")+"|" : String.format("%21.21s",isbn.toString())+"|";
        String formatoAutor = autor==null ? String.format("%31.31s","-")+"|" : String.format("%31.31s",autor.getNombre())+"|";
        String formatoEditorial = editorial==null ? String.format("%31.31s","-")+"|" : String.format("%31.31s", editorial.getNombre())+"|";
        String formatoAnio = anio==null ? String.format("%5.5s","-")+"|" : String.format("%5.5s",anio.toString() )+"|";
        return formatoId + formatoTitulo + formatoIsbn + formatoAutor + formatoEditorial + anio + "\n";
        
    }
    
    
}
