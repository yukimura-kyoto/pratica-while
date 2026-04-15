package while_no_java;

import java.util.Scanner;

public class ContadorPar {

    // Atividade 05

    static void main() {
        Scanner sc = new Scanner(System.in);
        int quantidade=0;

        double result;

        while (quantidade<=50){
            result = quantidade % 2;

            if (result==0){
                System.out.println(quantidade+" - Esse numero é Par");
            } else if (result==1){
            }
            quantidade++;
        }
    }
}
