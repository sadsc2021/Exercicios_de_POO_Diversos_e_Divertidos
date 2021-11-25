import java.util.Scanner;

public class atividade8 {
    //Escreva um programa que receba dois conjuntos de números(arranjos de inteiros),
    //podendo estes ter tamanhos diferentes, informados pelo usuário. Crie um terceiro
    //vetor para armazenar os dois arranjos unidos, e ordene os valores em ordem crescentes.
    //Finalmente, mostre o arranjo unido para o usuário.

    //Exemplo de entradas: {4,7,2} e {6,4,9,1}. Saída: {1,2,4,4,6,7,9}

    public void conjuntos(){

        System.out.println("Questão 8: Escreva um programa que receba dois conjuntos de números(arranjos de inteiros),\n podendo estes ter tamanhos diferentes, informados pelo usuário. Crie um terceiro\n");
        
        Scanner ler = new Scanner(System.in);

        System.out.println("digite o valor do primeiro conjunto.");
        int tam1 = ler.nextInt();
        System.out.println("digite o valor do segundo conjunto.");
        int tam2 = ler.nextInt();

        int[] vetor1 = new int[tam1];
        int[] vetor2 = new int[tam2];
        int[] vetor3 = new int[tam1+tam2];

        for(int i = 0; i < tam1; i++){
            System.out.println("Digite um numero para o primeiro conjunto.");
            vetor1[i] = ler.nextInt();
        }
        for(int i = 0; i < tam2; i++){
            System.out.println("Digite um numero para o segundo conjunto.");
            vetor2[i] = ler.nextInt();
        }

        for(int i = 0; i < (tam1+tam2); i++){
            if(i < tam1)
                vetor3[i] = vetor1[i];
            else
                vetor3[i] = vetor2[i-tam1];
        }
        

        int aux,menor;
        for(int i = 0; i < (tam1+tam2) ; i++){
            menor = i;
            for(int j = (i+1); j < (tam1+tam2) ; j++){
                if(vetor3[j] < vetor3[menor]){
                    menor = j;
                }
            }

            aux = vetor3[i];
            vetor3[i] = vetor3[menor];
            vetor3[menor] = aux;
        }
        String saida = "{ ";
        for(int i = 0; i < (tam1+tam2); i++){
            saida = saida = vetor3[i] + " , ";
        }
        saida = saida + " }";
        System.out.println(saida);
    } 
}