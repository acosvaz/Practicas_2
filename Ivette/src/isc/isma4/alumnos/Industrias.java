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
public class Industrias extends Alumnos {
    double negro;
    
    public Industrias (double negro) {
    this.negro=negro;
    }

    @Override
    public double getColor() {
        return negro;
    }
    
}
