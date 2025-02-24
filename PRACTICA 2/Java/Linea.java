/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*MACHACA ARCANI MAYA SALOME*/
package com.mycompany.practica2;
import javax.swing.*;
import java.awt.*;

public class Linea extends JPanel {
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

    public Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linea: " + p1 + " a " + p2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

    public void dibujaLinea() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(this);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        Linea.Punto p1 = new Linea.Punto(50, 100);
        Linea.Punto p2 = new Linea.Punto(300, 200);
        Linea linea = new Linea(p1, p2);
        linea.dibujaLinea();
    }
    
}
