import java.util.Scanner;

public class atividade5 {
    //Faça um programa que leia vários inteiros positivos e mostre, no final,
    //a soma dos números pares e a soma dos números ímpares. O programa para
    //quando entrar um número maior que 1000.

    Scanner ler = new Scanner(System.in);
    public int valor;

    
    public void varNum() {
        var i = 0;
        var par = 0;
        var impa = 0;
        var pam = 0;
        var soma = 0;
        var total = 0;

        System.out.println("Questão 5: Faça um programa que leia vários inteiros positivos e mostre, no final,\n a soma dos números pares e a soma dos números ímpares. O programa para\n quando entrar um número maior que 1000.\n");

        System.out.println("ATENÇÃO: Você só verá o Total dos Produtos após Finalizar a Operação.");
        System.out.println("Caso Queira Finalizar a Operação Digite 1000\n");
        
        do {
            System.out.println("Informe um Valor Inteiro Par ou Ímpar:");
            var valor = ler.nextInt();
            i++;
            if(valor>0 && valor%2==0){
                par++;
            }
            if(valor>0 && valor%2>=1){
                impa++;
            }
            if(valor>0 && valor%2==0){
                pam=pam+valor;
            }
            if(valor>0){
                soma+=valor;
            }
            if(valor>0){
                total++;
            }
            if(valor >= 1000){
                break;
            }
        }while(valor < 1000);
        System.out.println("A quantidade de números pares é: " + par);
        System.out.println("A quantidade de números ímpares é: " + impa);
        System.out.println("A média dos valores pares é: " + (pam/total));
        System.out.println("A média dos valores ímpares é: " + (soma/total));
        System.out.println("Fim da Operação.\n");
    }
}