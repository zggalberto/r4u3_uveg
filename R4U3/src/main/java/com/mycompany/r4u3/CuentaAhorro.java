/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r4u3;

/**
 *
 * @author Gustavo Zúñiga
 */
public class CuentaAhorro extends CuentaBase {
    public void invertir(){
        this.setMontoActual(this.getMontoActual()*1.1);
    }
}
