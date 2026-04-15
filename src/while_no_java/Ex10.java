package while_no_java;

import java.util.Scanner;

public class Ex10 {
    static void main() {
        // eu to cansado :(
        // Atividade 10
        Scanner sc = new Scanner(System.in);

        int n1,contadorNeg=0,contadorPos=0,i=1;
        System.out.println("digite um numero");
        n1 = sc.nextInt();

        while (n1 != 0) {

            if (n1>0){
                contadorPos++;
            } else if (n1<0){
                contadorNeg++;
            }

            System.out.println("digite um numero");
            n1 = sc.nextInt();

        }
        System.out.println("voce digitou "+contadorPos+" numeros positivos e "+contadorNeg+" de Negativos");
    }
}
