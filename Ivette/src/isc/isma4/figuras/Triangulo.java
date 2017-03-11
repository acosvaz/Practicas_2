/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author ivette
 */
public class Triangulo extends Figura {
    double base;
    double altura;
    
    public Triangulo (double base, double altura){
    this.altura=altura;
    this.base=base;
    }

    @Override
    public double getArea() {
        return (base*altura)/2; 
    }
    
}
