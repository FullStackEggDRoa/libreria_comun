/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author droa
 */
public class utilidadesPelicula {
    public static Comparator<Pelicula> compararDuracionDESC = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula l1, Pelicula l2) {
            Float aux1= l1.getDuracionHoras();
            Float aux2= l2.getDuracionHoras();
            return aux2.compareTo(aux1);
        }
    };
    public static Comparator<Pelicula> compararDuracionASC = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula l1, Pelicula l2) {
            Float aux2= l1.getDuracionHoras();
            Float aux1= l2.getDuracionHoras();
            return aux2.compareTo(aux1);
        }
    };
    public static Comparator<Pelicula> compararTituloAZ = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula l1, Pelicula l2) {
            String aux2= l1.getTitulo();
            String aux1= l2.getTitulo();
            return aux2.compareTo(aux1);
        }
    };
    public static Comparator<Pelicula> comparardirectorAZ = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula l1, Pelicula l2) {
            String aux2= l1.getTitulo();
            String aux1= l2.getTitulo();
            return aux2.compareTo(aux1);
        }
    };
   
}
