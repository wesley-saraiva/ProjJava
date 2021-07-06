/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresLogicos_Condicionais;

/**
 *
 * @author wesle
 */
public class SwitchCase {

    public static void main(String[] args) {

        int dia = 2;
        //Switch case operacoes exatas
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
                
                default: System.out.println("Dia nao existe");
                break;
        }
    }
}
