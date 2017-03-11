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
public class Vaca extends Animales {
    double muu;
    
    public Vaca (double muu){
    this.muu= muu;
    }

    @Override
    public double getSonido() {
        return muu;
    }
    
}
