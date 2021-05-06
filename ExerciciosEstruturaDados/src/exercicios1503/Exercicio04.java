/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios1503;

import java.util.Scanner;

/*
4.Criar um vetor de String, cadastrar 5 nomes, em seguida colocá-lo 
em ordem alfabética.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomes[] = new String[5];

        String x;

        System.out.println("Digite 5 nomes: ");

        for (int i = 0; i < nomes.length; i++) {

            nomes[i] = entrada.nextLine();

        }

        for (int i = 1; i < nomes.length; i++) {

            for (int j = 4; j >= i; j--) {

                if (nomes[j - 1].compareTo(nomes[j]) > 0) {

                    x = nomes[j - 1];

                    nomes[j - 1] = nomes[j];

                    nomes[j] = x;

                }

            }

        }

        System.out.println("Os nomes em ordem alfabética são: ");

        for (int i = 0; i < nomes.length; i++) {

            System.out.println(nomes[i]);

        }
    }
}
