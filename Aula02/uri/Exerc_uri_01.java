//package uri;

import static java.lang.System.in;

import java.util.Scanner;

public class Exerc_uri_01 {

    public static void main(final String[] args) {

        final Scanner entrada = new Scanner(System.in);

        int A, B;
        int SOMA;

        A = entrada.nextInt();
        B = entrada.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        entrada.close();

    }

}