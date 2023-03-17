/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author droa
 */
public abstract class Forma implements calculosFormas {
    
    
    @Override
    public abstract void calcularPerimetro();

    @Override
    public abstract void calcularArea();
    
    
}
