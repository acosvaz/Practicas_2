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
public class Gastronomia extends Alumnos {
    double blanco;
    
    public Gastronomia (double blanco) {
    this.blanco=blanco;
    }

    @Override
    public double getColor() {
        return blanco; 
    }
    
}
