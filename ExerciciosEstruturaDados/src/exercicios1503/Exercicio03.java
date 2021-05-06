package exercicios1503;

import java.util.Scanner;

/*
Crie um vetor A de inteiro e cadastre 5 números. Depois 
implemente um vetor B que deverá conter os elementos do vetor A 
elevados ao quadrado.
*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetorA[] = new int[5];
	int vetorB[] = new int[5];
        
        //carregando vetorA
        //vetorA.length é diz o tamonho do vetor
	for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite os valores do vetor A: ");
	    vetorA[i] = entrada.nextInt();
	}
        
        System.out.println("Os valores do vetor B são: ");
        //carregando vetorB com valor do vetorA elevado a 2
	for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (int) Math.pow(vetorA[i],2);
	}
        
        //descarregando vetorB
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }
}
