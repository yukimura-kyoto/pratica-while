package while_no_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaNotas {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // não sei explicar direito mas isso cria uma lista infinita de ints e adiciona na array
        List<Integer> quantidadeNotas = new ArrayList<>(); // btw tipo de linha que eu tenho q decorar
        int nota;

        while (true){
            System.out.println();
            System.out.println("(Digite -1 para finalizar)");
            System.out.print("Digite sua Nota: ");
            nota = sc.nextInt();
            // se for -1 ele acaba
            if (nota==-1){
                break;
            }
            // ele adiciona se a condição de cima n for cumprida
            quantidadeNotas.add(nota);
        }

        double soma = 0;

        for (int i = 0; i < quantidadeNotas.size(); i++) {
            // isso soma a array até que ela chegue no final
            soma += quantidadeNotas.get(i);
        }

        // soma do bagui de cima dividido pela quantidade de variaveis na array
        System.out.println(soma/quantidadeNotas.size());
    }
}
