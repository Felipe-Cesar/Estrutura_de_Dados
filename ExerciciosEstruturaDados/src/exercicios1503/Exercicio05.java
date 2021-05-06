package exercicios1503;

import java.util.Scanner;

/*
  5.Elabore um programa que cadastre o nome de 5 pessoas, em 
  seguida crie uma rotina de consulta a esse vetor.
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomes[] = new String[5];

        System.out.println("Digite 5 nomes: ");

        for (int i = 0; i < nomes.length; i++) {

            nomes[i] = entrada.nextLine();

        }

        System.out.println("Digite a posição para consultar: ");

        int pos = entrada.nextInt();

        for (int i = 0; i < nomes.length; i++) {

            if (i == pos) {

                System.out.println(nomes[i]);

            }
        }

    }
}
