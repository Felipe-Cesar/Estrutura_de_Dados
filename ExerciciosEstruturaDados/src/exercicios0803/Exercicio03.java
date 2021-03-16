package exercicios0803;

import java.util.Scanner;

/*
        3. Criar um vetor que armazene os nomes de 5 pessoas e outro vetor para 
        armazenar as idades destas pessoas. No final, o programa deverá apresentar a 
        média de idade das pessoas cadastradas.

 */
public class Exercicio03 {

    public static void main(String[] args) {

        System.out.println("Resposta exercicio 3: ");

        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[5];
        int idade[] = new int[5];

        int soma = 0;
        //carregando os vetore
        //o nomes.length da o numero de indices do vetor nomes
        for (int i = 0; i < nomes.length; i++) {

            System.out.println("Nome: ");
            nomes[i] = entrada.nextLine();

            System.out.println("Idade: ");
            idade[i] = entrada.nextInt();
            //nextLine para limpar o buffer e nao dar problemas
            entrada.nextLine();
            soma += idade[i];// soma recebe idade[i] + idade[i]

        }

        int menor = idade[0];//menor recebe o malor do indice 0 do vetor 0
        int mais_novo = 0;

        for (int i = 0; i < idade.length; i++) {

            if (idade[i] < menor) {
                menor = idade[i];
                mais_novo = i;//masi novo recebe o valor do indice onde esta a menor idade
            }
        }

        int media = 0;
        media = soma / 5;

        System.out.println("A média das idades é: " + media + " anos.");
        //nomes[] vai mostra o nome do indice que tem  o mesmo valor de mais_novo 
        System.out.println("A menor idade do(a) " + nomes[mais_novo] + ", " + menor + " anos.");
    }
}
