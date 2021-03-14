
package exercicios0803;

        /*  
        2. Criar um vetor com 8 elementos interiros. Criar outro vetor de mesmo 
        tipo que devera conter os elementos do vetor A multiplicados pelo do 
        vetor B
        */

public class Exercicio02 {
    public static void main(String[] args) {
         
        
        System.out.println("Resposta Exercicio 2: ");
        
        int multA [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int multB [] = new int [8];
        
        //multiplicando vetor
        for (int j = 0; j < 8; j++) {
            multB[j] = (multA[j] *2); 
        }
        
        //imprimindo vetores
        for (int j = 0; j < 8; j++) {
           System.out.println(multB[j]); 
        }
    }
    
}
