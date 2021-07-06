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
public class IfElse {

    public static void main(String[] args) {

        String nome = "Wesley";
        int mediaAluno = 50;

        if (mediaAluno >= 70 && nome.equals("")) {
            System.out.println("Parabens " + nome + " voce esta aprovado");
        } else if (mediaAluno < 70) {
            System.out.println("Desculpe " + nome + " voce foi reprovado");
        } else {
            System.out.println("Aluno nao encontrado");
        }
        System.out.println("-------------------------");
        int n1 = 10;
        int n2 = 10;
        int n3 = 9;
        int n4 = 9;
        int media = 0;

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("resultado da media " + media);
        if (media >= 7) {
            System.out.println("Parabens voce esta aprovado");
        } else if (media == 5 && media < 7) {
            System.out.println("Aluno em recuperacao");
        } else {
            System.out.println("Aluno reprovado");
        }
        //Operadores ternarios sao para micro validacoes
        String saidaResultado;

        saidaResultado = media >= 70 ? "Aprovado"
                : (media == 5 && media < 70)
                        ? "Recuperação" : "Reprovado";

        System.out.println(saidaResultado);
        System.out.println("--------------");
        //Operações logicas aninhadas: São operações dentro de operacoes
        if (media >= 5) {
            if (media >= 7) {
               if(media >=9){
                   System.out.println("Parabens tirou a melhor nota");
               } else {
               System.out.println("Aluno esta aprovado");
               }
            } else {
                System.out.println("Aluno esta recuperacao");
            }
        } else {
            System.out.println("Aluno esta reprovado");
        }
    }
}
