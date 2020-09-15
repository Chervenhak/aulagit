package uri;

import java.util.Scanner;
//import java.util.SortedMap;

import sun.jvm.hotspot.tools.SysPropsDumper;

public class ExemploDoWhile {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, maior, menor;

        maior = Integer.MIN_VALUE; // menor valor possível para um inteiro
        menor = 0;

        // Ler 10 numeros inteiros
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número inteiro:");
            numero = in.nextInt();

            if (numero > maior) {
                maior = numero;
            } else {
                if (numero < menor)
                    menor = numero;
            }
        }

        // Exibir o maior e o menor
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);

        in.close();

    }
}