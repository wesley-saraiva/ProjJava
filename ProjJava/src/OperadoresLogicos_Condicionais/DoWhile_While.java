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
public class DoWhile_While {

    public static void main(String[] args) {
        // Estrutura de repeticao while

        int numero = 11;
        while (numero <= 10) {//Verifica e deopis executa o codico
            System.out.println("Nuemro atusl é " + numero);
            numero++;
        }
        System.out.println("------------------");

        int numero2 = 0;
        do {//primeiro executa e depois verifica;
            System.out.println("O numero atual é: "+numero2);
            numero2++;
        } while (numero2 <= 60);

    }
}
