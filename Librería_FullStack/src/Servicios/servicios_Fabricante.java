/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Fabricante;
import Persistencia.FabricanteDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicios_Fabricante {
    
    private FabricanteDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public servicios_Fabricante() {
        this.dao = new FabricanteDAO("tienda");
    }
    
    public ArrayList<Fabricante> listarNombreFabricantes() throws Exception {

        try {
            ArrayList<Fabricante> nombreProductos = new ArrayList<>();
            String querySql = "SELECT nombre FROM fabricante";
            return dao.consultaFabricantes(querySql);
        } catch (Exception e) {
            throw e;
        }
    }
}
