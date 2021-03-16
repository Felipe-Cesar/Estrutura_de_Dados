
package exercicios0803;

        /*  
        2. Criar um vetor com 8 elementos inteiros. Criar outro vetor de mesmo 
        tipo e tamanho que deverá conter os elementos do vetor A multiplicados 
        por 2.
        */

public class Exercicio02 {
    public static void main(String[] args) {
         
        
        System.out.println("Resposta Exercicio 2: ");
        
        int multA [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int multB [] = new int [8];
        
        //multiplicando vetor
        for (int  i= 0; i < 8; i++) {
            multB[i] = (multA[i] *2); 
        }
        
        //descarregando vetor
        for (int i = 0; i < 8; i++) {
           System.out.println(multB[i]); 
        }
    }
    
}
