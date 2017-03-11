/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.ismas4.animales;

/**
 *
 * @author ivette
 */
public class Pajaro extends Animales {
    double pururu;
    
    public Pajaro (double pururu) {
    this.pururu=pururu;
    }

    @Override
    public double getSonido() {
        return pururu;
    }
    
}
