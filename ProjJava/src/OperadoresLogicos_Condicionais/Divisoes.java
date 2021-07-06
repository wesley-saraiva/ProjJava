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
public class Divisoes {

    public static void main(String[] args) {

        //Modulo: Resto da divisao %
        double carro = 9;
        double pessoa = 2;

        double resto = carro % pessoa; //MOD

        System.out.println("Sobraram " + resto + "carros");

        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
        String pessoas = JOptionPane.showInputDialog("Informe a qauntidade de pessoas");

        double carrosNum = Double.parseDouble(carros);
        double pessoasNum = Double.parseDouble(pessoas);

        int divisao = (int) (carrosNum / pessoasNum);

        double restos = carrosNum % pessoasNum;

        int resultado = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao");

        if (resultado == 0) {
            JOptionPane.showMessageDialog(null, "Divisao para pessoas deu "+divisao);
        } else if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "Ok");
        }
        
         resultado = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisao");
         
         if (resultado == 0) {
            JOptionPane.showMessageDialog(null, "O resto da divisao dos carros "+restos);
        } else if(resultado == 1){
            JOptionPane.showMessageDialog(null, "Ok");
        }
    }
}
