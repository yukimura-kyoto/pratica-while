package while_no_java;

import java.util.Scanner;

public class NumeroSecreto {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int snum=7,digiNum;

        System.out.println("Tente adivinhar o número secreto");
        digiNum = sc.nextInt();

        while (digiNum!=snum){
            System.out.println("Numero errado");
            digiNum = sc.nextInt();
        }
        System.out.println("Voce acertou");
    }
}
