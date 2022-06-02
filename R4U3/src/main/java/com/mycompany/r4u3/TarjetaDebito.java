/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r4u3;

/**
 *
 * @author Gustavo Zúñiga
 */
public class TarjetaDebito extends CuentaBase {

    public double retirar(double cantidad){
        if ((this.getMontoActual() - cantidad)<0){
            System.out.println("Operación no realizada");
        }
        this.setMontoActual(this.getMontoActual() - cantidad);
        
        return this.getMontoActual();
    }
}
