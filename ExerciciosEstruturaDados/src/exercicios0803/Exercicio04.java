package exercicios0803;

import java.util.Scanner;

/*
        04. Desenvolver um programa que cadastre o nome e o salário de 5 
        funcionários. No final, o programa deverá mostrar o nome do funcionário 
        que possui o maior salário. Use vetores.
 */
public class Exercicio04 {

    public static void main(String[] args) {

        System.out.println("Resposta exercico 4: ");
        //criando os scanner para receber as informaçoes dod usuario
        Scanner entrada = new Scanner(System.in);

        //criando as variaveis e vetores
        String funcionario[] = new String[5];
        double salario[] = new double[5];

        double maiorSal = 0;
        String funcionarioMaiorSal = null;

        //pede o nome do funcionario e o salario para o usuario e grava nos scanners
        for (int i = 0; i < 5; i++) {
            //pede e pega o nome do funcionario
            System.out.println("Digite o nome do funcionario: \n");
            funcionario[i] = entrada.nextLine();

            //pede e pega o valor do salario
            System.out.println("Digite o salario do funcionario: \n");
            salario[i] = entrada.nextDouble();
            //nextLine para limpar o buffer e nao dar problemas
            entrada.nextLine();

            /*se o valor dentro do indice do vetor for maior que o valor aual da
            variavel, coloca esse valor na variavel e o nome do usuario na variavel funcionarioMaiorSal*/
            if (salario[i] > maiorSal) {
                funcionarioMaiorSal = funcionario[i];
                maiorSal = salario[i];
            }

        }
        //imprime o nome do usuario com maior salario
        System.out.println("O funcionario que recebe o maior salario é o : " + funcionarioMaiorSal);
    }
}
