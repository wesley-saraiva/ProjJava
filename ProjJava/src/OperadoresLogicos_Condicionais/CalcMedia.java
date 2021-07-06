/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresLogicos_Condicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class CalcMedia {

    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe a nota 1");
        String n2 = JOptionPane.showInputDialog("Informe a nota 2");
        String n3 = JOptionPane.showInputDialog("Informe a nota 3");
        String n4 = JOptionPane.showInputDialog("Informe a nota 4");

        double dn1 = Double.parseDouble(n1);
        double dn2 = Double.parseDouble(n2);
        double dn3 = Double.parseDouble(n3);
        double dn4 = Double.parseDouble(n4);

        double media = (dn1 + dn2 + dn3 + dn4) / 4;

        if (media >= 7 && media == 10) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media < 7 && media == 5) {
            JOptionPane.showMessageDialog(null, "Recuperaçao");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }

        JOptionPane.showMessageDialog(null, "A media é: " + media);
    }
}
