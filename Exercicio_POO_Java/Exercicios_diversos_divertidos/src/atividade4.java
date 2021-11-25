import java.util.Scanner;

public class atividade4 {
    //Faça um programa que calcula o produto dos números digitados pelo usuário.
    //O programa deve permitir que o usuário digite uma quantidade não determinada de números.
    //O programa encerra quando o usuário digita o valor zero.
 
    Scanner ler = new Scanner(System.in);
    public int valor;

    public void numInf() {
        var i = 0;
        var produto = 0;
        var pam = 0;

        System.out.println("Questão 4: Faça um programa que calcula o produto dos números digitados pelo usuário.\n O programa deve permitir que o usuário digite uma quantidade não determinada de números.\n O programa encerra quando o usuário digita o valor zero.\n");

        System.out.println("ATENÇÃO: Você só verá o Total dos Produtos após Finalizar a Operação.");
        System.out.println("Caso Queira Finalizar a Operação Digite 0\n");
        
        do {
            System.out.println("Informe um Valor do Produto:");
            var valor = ler.nextInt();
            i++;
            if(valor>0){
                pam=pam + valor;
                produto++;
            }
            if(valor == 0){
                System.out.println("Operação Finalizada pelo Usuário.");
                break;
            }
        }while(valor < 10000000);
        System.out.println("O Total dos Produtos é: " + (pam + produto - i + 1) + "\n");
    }
}