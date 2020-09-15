//package uri;

import static java.lang.System.in;

import java.util.Scanner;

public class Exerc_uri_02 {

    public static void main(final String[] args) {

        final Scanner entrada = new Scanner(System.in);

        double A, B, C;
        double PesoNota1, PesoNota2, PesoNota3, Media;
        double Peso1, Peso2, Peso3;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        Peso1 = 0.2;
        Peso2 = 0.3;
        Peso3 = 0.5;

        PesoNota1 = A * Peso1;
        PesoNota2 = B * Peso2;
        PesoNota3 = C * Peso3;

        Media = PesoNota1 + PesoNota2 + PesoNota3;

        System.out.printf("MEDIA = %.1f\n", Media);

        entrada.close();

    }

}