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
public class Gato extends Animales {
    double miau;
    
    public Gato (double miau) {
    this.miau=miau;
    }

    @Override
    public double getSonido() {
        return miau;
    }
    
}
