/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.r4u3;

/**
 *
 * @author Gustavo Zúñiga
 */
public class R4U3 {

    public static void main(String[] args) {
        TarjetaDebito td = new TarjetaDebito();
        System.out.println("########Tarjeta de debito########");
        System.out.println("monto inicial " + td.getMontoActual());
        td.depositar(125.5);
        System.out.println("depósito+: "+td.getMontoActual());
        td.retirar(25.5);
        System.out.println("despues del retiro: "+td.getMontoActual());
        
        TarjetaCredito tc = new TarjetaCredito(10000.0);
        System.out.println("########Tarjeta de crédito########");
        System.out.println("monto inicial: "+ tc.getMontoActual());
        tc.depositar(1000.0);
        System.out.println("depósito+: "+tc.getMontoActual());
        tc.sumaInteres();
        System.out.println("15% de interes"+ tc.getMontoActual());
        
        CuentaAhorro ca = new CuentaAhorro();
        System.out.println("########Cuenta ahorro########");
        System.out.println("monto inicial " + ca.getMontoActual());
        ca.depositar(2000.0);
        System.out.println("depósito de: "+ ca.getMontoActual());
        ca.invertir();
        System.out.println("+ invesión del 10%" + ca.getMontoActual());
        
    }
}
