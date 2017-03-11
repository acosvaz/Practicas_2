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
public class Perro extends Animales {
    double woof;
    
    public Perro (double woof) {
    this.woof=woof;
    }

    @Override
    public double getSonido() {
        return woof;
    }
    
}
