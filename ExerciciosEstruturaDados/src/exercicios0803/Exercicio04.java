
package exercicios0803;

import java.util.Scanner;

        /*
        4. Desenvolver um programa que cadastre o nome e salario de 5 
        funcionarios.No final o programa devera mostra o nome do funcionario que
        possui o maior salario. Use vetores
        */

public class Exercicio04 {
    public static void main(String[] args) {
     
        
        System.out.println("Resposta exercico 4: ");
        //criando os scanner para receber as informaçoes dod usuario
        Scanner entradaFuncionario = new Scanner(System.in);
        Scanner entradaSalario = new Scanner(System.in);
        
        //criando as variaveis e vetores
        String funcionario [] = new String [5];
        double salario [] = new double [5];
        double maiorSal = 0;
        String funcionarioMaiorSal = "";
        
        //pede o nome do funcionario e o salario para o usuario e grava nos scanners
        for (int l = 0; l < 5; l++) {
            //pede e pega o nome do funcionario
            System.out.println("Digite o nome do funcionario: \n");
            funcionario[l] = entradaFuncionario.nextLine();
            //pede e pega o valor do salario
            System.out.println("Digite o salario do funcionario: \n");
            salario[l] = entradaSalario.nextDouble();
            /*se o valor dentro do indice do vetor for maior que o valor aual da
            variavel, coloca esse valor na variavel e o nome do usuario na variavel funcionarioMaiorSal*/
            if (salario[l] > maiorSal) {
                funcionarioMaiorSal = funcionario[l];    
                maiorSal = salario [l];                    
                }
            
        }
        //imprime o nome do usuario com maior salario
        System.out.println( "O funcionario que recebe o maior salario é o : " + funcionarioMaiorSal);
    }
}
