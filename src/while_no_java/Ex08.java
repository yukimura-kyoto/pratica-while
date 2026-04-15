package while_no_java;

import java.util.Scanner;

public class Ex08 {

    // Atividade 08

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n1;
        double result,soma=0;

        System.out.println("Digite um número");
        n1 = sc.nextInt();

        while (n1>=0){
            result = n1 % 2;

            if (result==0){
                soma += n1;
            }
            n1--;
        }
        System.out.println(soma);
    }
}
