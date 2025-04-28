/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teatro;

/**
 *
 * @author LENOVO
 */
public class Platea extends Boleto{
    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        if (diasAnticipacion >= 10) {
            this.precio = 50.0;
        } else {
            this.precio = 60.0;
        }
    }    
}
