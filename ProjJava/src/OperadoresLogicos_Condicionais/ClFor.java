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
public class ClFor {

    public static void main(String[] args) {

        //Estrutura de repeticao FOR com break(Parada)
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println(numero);
            if (numero == 7) {
                System.out.println("Obaa encontrei o numero 7");
                System.out.println("Estou parando de executar");
                break;
            }
        }
        System.out.println("--------------------");
        System.out.println("Notas que significam a situacao do aluno");

        for (int media = 0; media <= 10; media++) {

            if (media == 0 || media < 5) {
                System.out.println("Reprovado " + media);
                continue;
            }
            if (media == 5 || media < 7) {
                System.out.println("Recuperacao " + media);
                continue;
            }
            if (media == 7 || media <= 10) {
                System.out.println("Aprovado " + media);
                continue;

            }
            break;
        }
    }
}
