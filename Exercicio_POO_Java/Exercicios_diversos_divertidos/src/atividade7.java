import java.util.Scanner;

public class atividade7 {
    //Programe um Algoritmo que receba como parâmetro a idade de
    //uma pessoa expressa em anos, meses e dias, e mostre-a expressa
    //em dias.

    public void idDia() {
        Scanner ler = new Scanner(System.in);

        var diaAno = 365;
        var diaMes = 30;

        System.out.println("Questão 7: Programe um Algoritmo que receba como parâmetro a idade de\n uma pessoa expressa em anos, meses e dias, e mostre-a expressa em dias. \n");

        System.out.println("Digite o seu nome:");
        String nome = ler.nextLine();
        System.out.println("Informe Quantos Anos você tem:");
        int ano = ler.nextInt();
        System.out.println("Informe Quantos Meses você tem:");
        int mes = ler.nextInt();
        System.out.println("Informe Quantos Dias você tem:");
        int dia = ler.nextInt();

        var totDiaAno = ano * diaAno;
        var totDiaMes = mes * diaMes;
        var totalDiasNasc = totDiaAno + totDiaMes + dia;

        System.out.printf("Olá " + nome + " A sua Idade expressa em Dias é: " + totalDiasNasc + "\n");
    }
}
