/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

/**
 *
 * @author danie
 */
public class Atm {
    Cuenta cuenta;
    int Id;
    double cantidad;

    public Atm() {
    }

    public Atm(Cuenta cuenta, int Id, double cantidad) {
        this.cuenta = cuenta;
        this.Id = Id;
        this.cantidad = cantidad;
    }
    
    public double extraerDinero(){
        
        this.cantidad = cuenta.saldo;
        return cantidad;
    }
    
    
    
    
}
