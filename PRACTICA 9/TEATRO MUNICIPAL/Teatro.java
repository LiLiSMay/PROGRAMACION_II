/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teatro;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Teatro extends javax.swing.JFrame{

    public Teatro() {
        initComponents();
        setLocationRelativeTo(null);
        diasTextField.setEnabled(false);
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        palcoRadioButton = new javax.swing.JRadioButton();
        plateaRadioButton = new javax.swing.JRadioButton();
        galeriaRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        diasTextField = new javax.swing.JTextField();
        venderButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        informacionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jLabel1.setText("Datos del Boleto");

        buttonGroup1.add(palcoRadioButton);
        palcoRadioButton.setText("Palco");
        palcoRadioButton.addActionListener(evt -> diasTextField.setEnabled(false));

        buttonGroup1.add(plateaRadioButton);
        plateaRadioButton.setText("Platea");
        plateaRadioButton.addActionListener(evt -> diasTextField.setEnabled(true));

        buttonGroup1.add(galeriaRadioButton);
        galeriaRadioButton.setText("Galería");
        galeriaRadioButton.addActionListener(evt -> diasTextField.setEnabled(true));

        jLabel2.setText("Número:");

        jLabel3.setText("Cant. Días para el Evento:");

        venderButton.setText("Vender");
        venderButton.addActionListener(evt -> venderActionPerformed());

        salirButton.setText("Salir");
        salirButton.addActionListener(evt -> System.exit(0));

        informacionLabel.setText("Información");

        setLayout(new java.awt.GridLayout(0, 2));
        add(jLabel1); add(new JLabel(""));
        add(palcoRadioButton); add(plateaRadioButton);
        add(galeriaRadioButton); add(new JLabel(""));
        add(jLabel2); add(numeroTextField);
        add(jLabel3); add(diasTextField);
        add(venderButton); add(salirButton);
        add(informacionLabel);

        pack();
    }

    private void venderActionPerformed() {
        try {
            int numero = Integer.parseInt(numeroTextField.getText());
            int dias = diasTextField.isEnabled() ? Integer.parseInt(diasTextField.getText()) : 0;
            Boleto boleto;

            if (palcoRadioButton.isSelected()) {
                boleto = new Palco(numero);
            } else if (plateaRadioButton.isSelected()) {
                boleto = new Platea(numero, dias);
            } else if (galeriaRadioButton.isSelected()) {
                boleto = new Galeria(numero, dias);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un tipo de boleto.");
                return;
            }

            informacionLabel.setText(boleto.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese datos válidos.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Teatro().setVisible(true);
        });
    }
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel informacionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton palcoRadioButton;
    private javax.swing.JRadioButton plateaRadioButton;
    private javax.swing.JRadioButton galeriaRadioButton;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JTextField diasTextField;
    private javax.swing.JButton venderButton;
    private javax.swing.JButton salirButton;
}
