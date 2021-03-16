package exercicios0803;

public class Exercicio05 {

    public static void main(String[] args) {
        /*
        5. Criar um vetor com 10 elementos inteiros. Implementar um programa que
        mostre a quantidade e os elementos do vetor que sejam pares. 

         */

        System.out.println("Resposta exercicio 5: ");

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int par = 0;

        /*roda o vetor e se ovalor dentro do indicer tiver o resto zero adiciona
        +1 a variavel par imprime o valor dentro do indice*/
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                //valor é par
                par++;
                System.out.println("O numero " + vetor[i] + " é par");
            }
        }

        //Descarregando vetor
        System.out.println("Tem " + par + " numeros pares");
    }
}
