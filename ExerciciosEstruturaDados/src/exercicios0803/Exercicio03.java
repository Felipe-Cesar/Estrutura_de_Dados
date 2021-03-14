
package exercicios0803;

        /*
        3. Criar um vetor que armazene os nomes de 5 pessoas e ouutro vetor para
        armazenar as idades destas pessoas.No final o programa devera apresentar
        a media de idade das pessoas cadastradas
        */

public class Exercicio03 {
    public static void main(String[] args) {
       
        
        System.out.println("Resposta exercicio 3: ");
        
        String nom [] = {"vitor", "alan", "isabela", "natasha"};
        int idade [] = {10, 20, 30, 40, 50};
        double media = 0;
        
        //foda os valores dos vetores e divide por 5
        for (int k = 0; k < 5; k++) {
            media = (idade[k] + idade[k])/5;
        }
        
        System.out.println(media);
    }
    
}
