/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Fabricante;
import Entidades.Producto;
import Persistencia.ProductoDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicios_Producto {
    
    // Atributos
    private ProductoDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Constructores
    public servicios_Producto() {
        this.dao = new ProductoDAO("tienda");
    }
    
    //Metodos
    public ArrayList<Producto> listarNombreProductos() throws Exception {

        try {
            //ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT nombre FROM producto";
            return dao.consultaProductos(querySql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList<Producto> listarProductos() throws Exception {

        try {
            
            //String querySql = "SELECT * FROM producto INNER JOIN fabricante ON producto.codigo=fabricante.codigo";
            String querySql = "SELECT * FROM producto";
            return dao.consultaProductos(querySql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList<Producto> listarNombrePreciosProductos() throws Exception {

        try {
            //rrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT nombre,precio FROM producto";
            return dao.consultaProductos(querySql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList<Producto> listarNombreRango120_202() throws Exception {

        try {
            //ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT * FROM producto WHERE precio > 120 AND precio < 202 ";
            return dao.consultaProductos(querySql);

        } catch (Exception e) {
            throw e;
        }
    }
    public ArrayList<Producto> listarBusquedaProducto(String criterio) throws Exception {

        try {
            //ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT * FROM producto WHERE nombre LIKE '%"+criterio+"%'";
            return dao.consultaProductos(querySql);

        } catch (Exception e) {
            throw e;
        }
    }
    public ArrayList<Producto> listarProductoBarato() throws Exception {

        try {
            //ArrayList<Producto> nombreProductos = new ArrayList<>();
            String querySql = "SELECT nombre,precio FROM producto ORDER BY precio ASC LIMIT 1";
            return dao.consultaProductos(querySql);

        } catch (Exception e) {
            throw e;
        }
    }
    public void ingresarProducto() throws Exception {
        try{
            Producto producto = new Producto();
            //Fabricante fabricante = new Fabricante();
            servicios_Fabricante sF = new servicios_Fabricante();
            int contadorFabricante = 1;
            //int codigoFabricante=0;

            System.out.println("..:: Ingreso de Producto ::..");
            System.out.print("Ingrese Nombre de Producto: ");
            producto.setNombre(leer.next());
            System.out.print("Ingrese Precio: ");
            producto.setPrecio(leer.nextDouble());
            
            do{
                String comanda = "Ingrese Fabricante [";
                for(Fabricante aux : sF.listarNombreFabricantes()){
                    comanda+=contadorFabricante+". "+aux.getNombre()+" | ";
                    contadorFabricante++;
                }

                System.out.print(comanda+" "+contadorFabricante+". Ingresar Nuevo Fabricante]: ");
                int seleccion = leer.nextInt();
                if(seleccion < contadorFabricante){
                    producto.setCodigoFabricante(seleccion);
                    contadorFabricante=0;
                    
                }else{
                    sF.ingresarFabricante();
                    contadorFabricante=1;
                }

            }while(contadorFabricante!=0);

            String querySql = "INSERT INTO producto (nombre,precio,codigo_fabricante) VALUES ('"+producto.getNombre()+"','"+producto.getPrecio()+"','"+producto.getCodigoFabricante()+"')";
            dao.ingresarProducto(querySql);
            
        } catch (Exception e) {
            throw e;
        } 
       
    }
    
    public void editarProducto() throws Exception{
        System.out.println(".:: Editar Producto ::..");
        try{
            ArrayList<Producto> nombreProductos = new ArrayList<>();
            servicios_Fabricante sF = new servicios_Fabricante();
            int contadorFabricante = 1;
            String nombreFabricante = "";
            String querySql="";
            
            System.out.print("Ingrese el Codigo de Producto: ");
            int codigoProducto = leer.nextInt();
            nombreProductos=dao.consultaProductos("SELECT * FROM producto WHERE codigo="+codigoProducto);
            for(Producto auxProducto : nombreProductos){
                System.out.print("Editar Nombre de Producto ["+auxProducto.getNombre()+"] ENTER para Mantener: ");
                auxProducto.setNombre(leer.next());
                System.out.print("Editar Precio de Producto ["+auxProducto.getPrecio()+"] ENTER para Mantener: ");
                auxProducto.setPrecio(leer.nextDouble());
                do{
                    String comanda = "Editar Fabricante [";
                    for(Fabricante auxFabricante : sF.listarFabricantes()){

                        comanda+=contadorFabricante+". "+auxFabricante.getNombre()+" | ";
                        contadorFabricante++;
                        if(auxFabricante.getCodigo()==auxProducto.getCodigo()){
                           nombreFabricante = auxFabricante.getNombre();
                        }
                    }
                    System.out.print(nombreFabricante+"] \n"+comanda+"\n "+contadorFabricante+". Ingresar Nuevo Fabricante] ENTER para Mantener: ");
                    int seleccion = leer.nextInt();
                    if(seleccion < contadorFabricante){
                        auxProducto.setCodigoFabricante(seleccion);
                        contadorFabricante=0;

                    }else{
                        sF.ingresarFabricante();
                        contadorFabricante=1;
                    }
                    
                }while(contadorFabricante!=0);
                querySql = "UPDATE producto SET "
                    + " nombre = '" + auxProducto.getNombre()+ "' , precio = '" + auxProducto.getPrecio()+ "' , codigo_fabricante = " + auxProducto.getCodigoFabricante()
                    + " WHERE codigo = '" + codigoProducto+ "'";
            }
            
            
            dao.modificarProducto(querySql); 
            
        }catch (Exception e) {
            throw e;
        }
    }
}
