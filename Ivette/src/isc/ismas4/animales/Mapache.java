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
public class Mapache extends Animales {
    double akk;
    
    public Mapache (double akk) {
    this.akk= akk;
    }

    @Override
    public double getSonido() {
        return akk;
    }
    
}
