/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabase;

/**
 *
 * @author Gustavo Zúñiga
 */
public class Cuenta {
    private double montoActual;
 
    
    Cuenta( double apertura){
    this.montoActual = apertura;
    }
    
    Cuenta(){
    this.montoActual = 0.0;
    }
    
    
    public double setDepositar(double cantidad){
       return this.montoActual += cantidad;
    }
    
    public double getMontoActual(){
    return this.montoActual;
    }
}