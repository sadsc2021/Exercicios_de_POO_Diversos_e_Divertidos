import java.util.Scanner;

public class atividade2 {
    //Crie um algoritmo que, dado três números informados pelo usuário, verifique se algum
    //deles é múltiplo de outro. Note que pode haver mais de um múltiplo entre eles.

    public void mult() {
        System.out.println("Questão 2: Crie um algoritmo que, dado três números informados pelo usuário, verifique se algum\n deles é múltiplo de outro. Note que pode haver mais de um múltiplo entre eles.\n");
        
        Scanner lerMultiplica = new Scanner(System.in);

        System.out.println("ATENÇÃO: Informe apenas números inteiros, caso contrário vai dar erro.\n");
        System.out.println("Informe o primeiro Número:");
        int prim = lerMultiplica.nextInt();
        System.out.println("Informe o segundo Número:");
        int seg = lerMultiplica.nextInt();
        System.out.println("Informe o terceiro Número:");
        int terc = lerMultiplica.nextInt();

        if (prim % seg == 0) {
            System.out.println(prim + " é multiplo de " + seg);
        }else if (prim % terc == 0) {
            System.out.println(prim + " é multiplo de " + terc);
        }else if (seg % terc == 0) {
            System.out.println(seg + " é multiplo de " + terc);
        }else if (seg % prim == 0) {
            System.out.println(seg + " é multiplo de " + prim);
        }else if (terc % prim == 0) {
            System.out.println(terc + " é multiplo de " + prim);
        }else if (terc % seg == 0) {
            System.out.println(terc + " é multiplo de " + seg);
        }else{
            System.out.println("Não são multiplos.");
        }
    }
}
