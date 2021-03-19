package exercicios1503;

import java.util.Scanner;

/*
    Criar um vetor de inteiro com 5 elementos, em seguida colocá-lo 
    em ordem decrescente.

 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[5];
        int aux;
        boolean controle;

        System.out.println("Digite os valores do vetor: ");
        //carregando vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (int j = 0; j < (vetor.length - 1); j++) {

                /*
                    se o numero do indice j for menor que o proximo (j+1)
                    entao o valor do indice j vai pro variavel aux o valor  
                    do indice j+1 vai para o indice j e o valor da variavel aux
                    vai para o indice j+1, ele troca o valor da anterior com o da
                    proxima
                 */
                if (vetor[j] < vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }
            }

            if (controle) {
                break;
            }
        }

        //descarregando vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

        }

    }
}
