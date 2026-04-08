package while_no_java;

import java.util.Scanner;

public class Impar_Par {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double result;

        // enquanto = while (condição=verdadeira)
        while (true){
            System.out.print("Digite um Número: ");
            int n1 = sc.nextInt();
            result = n1 % 2;

            if (result==0){
                System.out.println("Par");
            } else if (result==1){
                System.out.println("Impar");
            }
        }
    }
}
