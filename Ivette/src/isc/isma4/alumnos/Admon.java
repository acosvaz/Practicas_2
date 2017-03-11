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
public class Admon extends Alumnos {
    double rojo;
    
    public Admon (double rojo) {
    this.rojo=rojo;
    }

    @Override
    public double getColor() {
        return rojo;
    }
    
}
