/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r4u3;

/**
 *
 * @author Gustavo Zúñiga
 */
public class CuentaBase {
     private double montoActual;
     
    CuentaBase(double montoActual){
        this.montoActual = montoActual;
       }
    
    CuentaBase(){
        this.montoActual = 0.0;
    }
 
             
    public void setMontoActual(double cantidad){
       this.montoActual = cantidad;
    }
    
    public double getMontoActual(){
    return this.montoActual;
    }
    
    public void depositar(double cantidad){
        this.setMontoActual(this.getMontoActual() + cantidad);
    }
    

    
    }