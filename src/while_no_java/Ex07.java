package while_no_java;
import java.util.Scanner;

public class FatorialNumero {
    static void main() {

        // Atividade 07

        Scanner sc = new Scanner(System.in);
        int a = 1,b=1;

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        while (n1>=0){

            b = b*a; // b mais a igual b atual
            a++; // adiciona +1

            n1--; // numero da contagem
        }
        System.out.println(b);
    }
}
