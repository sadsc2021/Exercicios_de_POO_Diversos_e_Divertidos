import java.util.Scanner;

public class atividade1 {
    //Crie um algoritmo que, dado o nível de alerta de risco, imprima se ele for GRAVE.
    //O nível de alerta é um número que varia de 0 a 10. O nível é considerado GRAVE quando
    //ele é superior a 9.

    Scanner lerRisco = new Scanner(System.in);

    public int nivel;

    public void risco() {   
        System.out.println("Questão 1: Crie um algoritmo que, dado o nível de alerta de risco, imprima se ele for GRAVE.\n O nível de alerta é um número que varia de 0 a 10. O nível é considerado GRAVE quando\n ele é superior a 9.\n");
        
        System.out.println("Para Finalizar a Operação Digite -1\n");

        do {
            System.out.println("Informe um Valor entre 0 e 10, para vermos o nível do risco.");

            var nivel = lerRisco.nextInt();

            if (nivel >= 0 && nivel < 9) {
                System.out.println("AGUARDE... Estamos analisando os dados....");
                System.out.println("Dados Analisados, Até o momento não tem risco Grave.");
            }else if (nivel > 9) {
                System.out.println("AGRARDE... Estamos analisando os dados....");
                System.out.println("ALERTA!");
                System.out.println("Fomos Informados que é um Nível de Risco muito Grave.");
            }else if (nivel == -1) {
                System.out.println("\nOperação Finalizada pelo Usuário.\n");
                break;
            }
        }while (nivel < 10000);        
    }
}