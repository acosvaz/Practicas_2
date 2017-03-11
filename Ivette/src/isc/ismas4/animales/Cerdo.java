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
public class Cerdo extends Animales {
    double oing;
    
    public Cerdo (double onig) {
    this.oing=onig;
    }

    @Override
    public double getSonido() {
        return oing;
    }
    
}
