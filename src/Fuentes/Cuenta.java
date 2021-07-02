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
public class Cuenta {
    int numero;
    static double saldo;
    Atm atm;

    public Cuenta() {
    }
 
    public boolean validarRetiro(double cantidad){
        atm = new Atm(cantidad);
        saldo = 200.00;
        double aux;
        aux = atm.getCantidad();
        if(aux > this.saldo){
            return false;
        }else{
            return true;
        }
    }
    
    
    
}
