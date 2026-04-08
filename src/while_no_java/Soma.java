package while_no_java;

import java.util.Scanner;

public class Soma {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = 0,b=0;

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        while (n1>=0){

            b = b+a; // b mais a igual b atual
            a++; // adiciona +1

            n1--; // numero da contagem
        }
        System.out.println(b);
    }
}
