/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Baraja {
    //Atributos
    ArrayList <Carta> baraja = new ArrayList<>();
    ArrayList <Carta> monton = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    //Constructores
    
    public Baraja() {
        for(int i=0;i<4;i++){
            for(int j=0;j<12;j++){
                if(j>=7 && j<=8){
                    
                }else{
                    switch (i) {
                        case 0 -> this.baraja.add(new Carta((j+1), 'e'));
                        case 1 -> this.baraja.add(new Carta((j+1), 'b'));
                        case 2 -> this.baraja.add(new Carta((j+1), 'o'));
                        case 3 -> this.baraja.add(new Carta((j+1), 'c'));
                    }
                }
            }
        }
        
    }
    
    //Métodos
    public void barajar(){
        Collections.shuffle(this.baraja);
    }
    public void siguienteCarta(){
        if(!this.baraja.isEmpty()){
            
            System.out.println(this.baraja.get(this.baraja.size()-1));
            this.monton.add(this.baraja.get(this.baraja.size()-1));
            this.baraja.remove(this.baraja.get(this.baraja.size()-1));
        }else{
            System.out.println("Lo siento. No existen Cartas en la Baraja.");
        }
    }
    public void cartasDisponibles(){
        if(!this.baraja.isEmpty()){
            
            System.out.println("Existen "+this.baraja.size() +" cartas para repartir.");
        }else{
            System.out.println("Lo siento. No existen Cartas en la Baraja.");
        }
    }
    public void cartasMonton(){
        if(!this.monton.isEmpty()){
            
            System.out.println("Existen "+this.monton.size() +" cartas en el Montón.");
        }else{
            System.out.println("Lo siento. No existen Cartas en la montón.");
        }
    }
    public void darCartas(){
        
        if(!this.monton.isEmpty()){
            int cantidadCartas = 0;
            System.out.print("Cuantas Cartas necesitas?: ");
            cantidadCartas=leer.nextInt();
            if(cantidadCartas>this.baraja.size()){
                System.out.println("Lo siento. No tengo esa cantidad.");
            }else{
                do{
                    siguienteCarta();
                    cantidadCartas--;
                }while(cantidadCartas>=1);
            }
        }else{
            System.out.println("Lo siento. No existen Cartas en la montón.");
        }
        
    }
    
    
    @Override
    public String toString() {
        return "Baraja[" + "Baraja:" +"\n"+ baraja + "\n" +", Monton:" +"\n"+ monton +']';
    }
    
}
