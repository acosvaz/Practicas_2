/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.alumnos;

/**
 *
 * @author ivette
 */
public class Turismo extends Alumnos {
    double verde;
    
    public Turismo (double verde) {
    this.verde=verde;
    }

    @Override
    public double getColor() {
        return verde;
    }
    
}
