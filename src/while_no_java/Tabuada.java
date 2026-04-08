package while_no_java;

import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,result=0;

        // a quantidade de vezes que é 10
        // b é o numero mult

        System.out.println("Digite um Número para mostrar a tabuada");
        b = sc.nextInt();

        while (a<=10){

            result = b*a;
            System.out.println(b+"x"+a+"="+result);

            a++;
        }
    }
}
