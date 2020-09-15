package uri;

import java.util.Scanner;
//import java.util.SortedMap;

// corrigir esse algoritmo

import jdk.internal.platform.Container;

public class Exerci0303003 {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int limite, cont;
        System.out.print("Digite o número inteiro: ");
        limite = in.nextInt();

        while (cont <= limite) {
            System.out.print(cont + ", ");
            cont *= 2;
        }
        System.out.println();
        in.close();
    }

}