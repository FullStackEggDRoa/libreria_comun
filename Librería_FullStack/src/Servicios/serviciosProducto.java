/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosProducto {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearProducto(HashMap<String,Float> pr){
        boolean respuesta=false;
        String producto;
        Float precio;
        
        System.out.println("..::Ingreso Productos::. ");
        
        do{
            System.out.print("Ingrese el Producto: ");
            producto = leer.next();
            System.out.print("Ingrese el Precio: ");
            precio = leer.nextFloat();
            
            pr.put(producto,precio);
            
            System.out.print("Desea Ingresar otro Producto? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
        }while(respuesta);
    }
    
    public void modificarPrecio(HashMap<String,Float> pr){
        boolean respuesta=false;
        String producto;
        Float precio;
        
        System.out.println("..::Modificar Producto::.. ");
        
        do{
            System.out.print("Ingrese el nombre de Producto: ");
            producto = leer.next();
            try{
                Iterator<Map.Entry<String,Float>> it = pr.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry<String,Float> auxIt = it.next();
                    if(auxIt.getKey().equals(producto))
                    {
                        System.out.print("Ingrese el nuevo Precio: ");
                        auxIt.setValue(leer.nextFloat());
                    }
                }
                
            }catch (Exception e){
                System.out.println("Producto No encontrado. Intente Nuevamente");
            }
            
            System.out.print("Desea Modificar el precio de otro Producto? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
        }while(respuesta);
    }
    public void eliminarProducto(HashMap<String,Float> pr){
        boolean respuesta=false;
        String producto;
        
        System.out.println("..::Eliminar Producto::.. ");
        
        do{
            System.out.print("Ingrese el nombre de Producto: ");
            producto = leer.next();
            try{
                Iterator<Map.Entry<String,Float>> it = pr.entrySet().iterator();
                while(it.hasNext()){
                    if(it.next().getKey().equals(producto))
                    {
                        it.remove();
                    }
                }
                
            }catch (Exception e){
                System.out.println("Producto No encontrado. Intente Nuevamente");
            }
            
            System.out.print("Desea BORRAR otro Producto? [Si | No]: ");
            respuesta = leer.next().equalsIgnoreCase("Si");
        
        }while(respuesta);
    
    }
    
    public void listarNombreProductos(){
        
    }
    
}
