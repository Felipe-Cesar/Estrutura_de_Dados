
package exercicios0803;


public class Exercicio05 {
    public static void main(String[] args) {
        /*
        5. Criar um vetor com 10 elementos inteiros. Implementar um programa que 
        mostre a quantidade e os elementos que sejam par
        */
        
        System.out.println("Resposta exercicio 5: ");
        
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int par = 0;
        int impar = 0;
        
        /*roda o vetor e se ovalor dentro do indicer tiver o resto zero adiciona
        +1 a variavel par imprime o valor dentro do indice*/
        for (int m = 0; m < 10; m++) {
            if (vetor[m]%2 == 0) {
                //valor é par
                par++;
                System.out.println("O numero "+ vetor[m] + " é par");               
            }
        }
        
        //imprime a somatoria de todos os numeros pares*/
        System.out.println("Tem " + par + " numeros pares");
    }
}
