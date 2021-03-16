/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios0803;

    /*
        1. Criar dois vetores A e B, com  10 elementos inteiros cada. Criar um 
        terceiro vetor C que deverá conter a soma dos vetores A e B.

        */

public class Exercicio01 {
    public static void main(String[] args) {
         
       System.out.println("Resposta exercicio 1: ");
       
       int  vetorA [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int  vetorB [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int  vetorC [] = new int [10];
       
        //somando vetores
        for (int i = 0; i < 10; i++) {
            vetorC[i] = (vetorA[i] + vetorB[i]); 
        }
        
        //descarregando vetor
        for (int i = 0; i < 10; i++) {
           System.out.println(vetorC[i]); 
        }
    }
}
