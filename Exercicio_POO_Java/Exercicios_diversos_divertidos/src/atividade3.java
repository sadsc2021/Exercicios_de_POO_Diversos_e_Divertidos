import java.util.Scanner;

public class atividade3 {
    //Escrever um algoritmo que lê um valor em reais e calcule qual o menor número possível
    //de notas de 100, 50, 10, 5 e 1 em que o valor lido pode ser decomposto. Escrever o valor
    //lido e a relação de notas necessárias.

    public void valLido() {
        System.out.println("Questão 3: Escrever um algoritmo que lê um valor em reais e calcule qual o menor número possível\n de notas de 100, 50, 10, 5 e 1 em que o valor lido pode ser decomposto. Escrever o valor\n lido e a relação de notas necessárias.\n");

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Valor em Reais:");
        int real = ler.nextInt();

        var a=real%100;
        var b=a%50;
        var c=b%10;
        var d=c%5;            

        System.out.println("A Menor decomposição possível para R$: " + real + " é:");
        System.out.println((real/100) + " notas de 100");
        System.out.println((a/50) + " notas de 50");
        System.out.println((b/10) + " notas de 10");
        System.out.println((c/5) + " notas de 5");
        System.out.println((d/1) + " notas de 1");
        System.out.println("que totaliza R$: " + real + "\n");
    }
}
