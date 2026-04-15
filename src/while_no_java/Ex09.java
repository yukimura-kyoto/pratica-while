package while_no_java;

import java.util.Scanner;

public class MaiorNumero {

    // Atividade 09

    static void main() {
        Scanner sc = new Scanner(System.in);

        int n1,maior=0;
        System.out.println("Digite um numero");
        n1 = sc.nextInt();

        while (n1>0){
            System.out.println("Digite um numero");
            n1 = sc.nextInt();
            if (maior <= n1){
                maior = n1;
            }
        }
        System.out.println("maior numero foi "+maior);
    }
}
