/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebafiguras;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class PruebaFiguras {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja"};

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2); // 0 para Cuadrado, 1 para Circulo
            String color = colores[rand.nextInt(colores.length)];
            if (tipo == 0) {
                double lado = 1 + rand.nextDouble() * 10;
                figuras[i] = new Cuadrado(lado, color);
            } else {
                double radio = 1 + rand.nextDouble() * 10;
                figuras[i] = new Circulo(radio, color);
            }
        }

        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.printf("Area: %.2f\n", figura.area());
            System.out.printf("Perimetro: %.2f\n", figura.perimetro());

            if (figura instanceof Coloreado) {
                System.out.println(((Coloreado) figura).comoColorear());
            }
            System.out.println();
        }
    }
}
