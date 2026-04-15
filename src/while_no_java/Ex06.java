package while_no_java;

import java.util.Scanner;

public class MediaNotas {

    // Atividade 06

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,contador = 0;
        double soma = 0;

        System.out.println("Digite sua nota");
        n1 = sc.nextInt();

        while (n1 != -1) {
            soma += n1;
            contador++;
            System.out.println("Digite sua nota");
            n1 = sc.nextInt();
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Sua media e" + media);
        }
    }
}
