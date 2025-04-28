/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teatro;

/**
 *
 * @author LENOVO
 */
public class Galeria extends Boleto {
        public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        if (diasAnticipacion >= 10) {
            this.precio = 25.0;
        } else {
            this.precio = 30.0;
        }
    }
    
}
