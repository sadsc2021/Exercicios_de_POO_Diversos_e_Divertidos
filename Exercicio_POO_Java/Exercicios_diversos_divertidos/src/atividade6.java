import java.util.Scanner;

public class atividade6 {
    //Escreva um algoritmo que leia um valor inicial A e imprima a sequência de valores
    //do cálculo de A! (fatorial) e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120

    public void fatorial() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Questão 6: Escreva um algoritmo que leia um valor inicial A e imprima a sequência de valores\n do cálculo de A! (fatorial) e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120\n");

        System.out.println("Informe um número inteiro para podermos fatorar ele.");
        int num = ler.nextInt();
        System.out.println("O Valor informado foi: " + num);
        
        System.out.println("Fatorando...");

        var numero = num;
        var i = 0;
        for(num=num; num >= 1; num--){
            System.out.println(num);
        }
        for(i=numero-1; i>0; i--){
            numero*=i;
        }
        System.out.println("Valor Total da Fatoração é: " + numero + "\n");
    }
}