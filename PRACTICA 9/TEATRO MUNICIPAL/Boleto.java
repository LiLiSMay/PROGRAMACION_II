/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teatro;

/**
 *
 * @author LENOVO
 */
public class Boleto {
    protected int numero;
    protected double precio;
    
    public Boleto(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}
