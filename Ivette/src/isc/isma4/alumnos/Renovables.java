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
public class Renovables extends Alumnos {
    double azulfuerte;
    
    public Renovables (double azulfuerte) {
    this.azulfuerte=azulfuerte;
    }

    @Override
    public double getColor() {
        return azulfuerte;    
                
    }
    
}
