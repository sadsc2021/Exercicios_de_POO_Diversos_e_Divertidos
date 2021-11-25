import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha Qual é a Atividade que Você Deseja Executar.");
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8");

        int lendoAtiv = ler.nextInt();

        switch (lendoAtiv) {
            case 1:
            System.out.println("Atividade 1 Foi Iniciada.\n");
            //CORETO
            atividade1 ativ1 = new atividade1();
            ativ1.risco();
            break;

            case 2:
            System.out.println("Atividade 2 Foi Iniciada.\n");
            //CORRETO
            atividade2 ativ2 = new atividade2();
            ativ2.mult();
            break;

            case 3:
            System.out.println("Atividade 3 Foi Iniciada.\n");
            //CORRETO
            atividade3 ativ3 = new atividade3();
            ativ3.valLido();
            break;

            case 4:
            System.out.println("Atividade 4 Foi Iniciada.\n");
            //CORRETO
            atividade4 ativ4 = new atividade4();
            ativ4.numInf();
            break;

            case 5:
            System.out.println("Atividade 5 Foi Iniciada.\n");
            //CORRETO
            atividade5 ativ5 = new atividade5();
            ativ5.varNum();
            break;

            case 6:
            System.out.println("Atividade 6 Foi Iniciada.\n");
            //CORRETO
            atividade6 ativ6 = new atividade6();
            ativ6.fatorial();
            break;

            case 7:
            System.out.println("Atividade 7 Foi Iniciada.\n");
            //CORRETO
            atividade7 ativ7 = new atividade7();
            ativ7.idDia();
            break;

            case 8:
                System.out.println("Atividade 8 Foi Iniciada.\n");
                //NÃO FEITO
                atividade8 ativ8 = new atividade8();
                ativ8.conjuntos();
            break;

            default:
            System.out.println("Você Digitou um Número Inválido.");
        }
    }
}