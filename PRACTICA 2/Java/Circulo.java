/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*MACHACA ARCANI MAYA SALOME*/
package com.mycompany.practica2;
import javax.swing.*;
import java.awt.*;

public class Circulo extends JPanel{
    public static class Punto {
        public int x, y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo: centro " + centro + ", radio " + radio;
    }

        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(centro.x - (int) radio, centro.y - (int) radio, (int) radio * 2, (int) radio * 2);
    }

    public void dibujaCirculo() {
        JFrame frame = new JFrame("Dibujar Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Circulo.Punto centro = new Circulo.Punto(200, 200);
        Circulo circulo = new Circulo(centro, 50);
        circulo.dibujaCirculo();
    }
}
