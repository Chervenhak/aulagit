//package uri;

import java.util.Scanner;

public class Exerc_uri_03 {

    public static void main(final String[] args) {

        final Scanner entrada = new Scanner(System.in);

        int CodigoP1, CodigoP2;
        int QuantPeca1, QuantPeca2;
        Double ValorPeca1, ValorPeca2, ValorPagar;
        
        CodigoP1 = entrada.nextInt();
        QuantPeca1 = entrada.nextInt();
        ValorPeca1 = entrada.nextDouble();
        CodigoP2 = entrada.nextInt();
        QuantPeca2 = entrada.nextInt();
        ValorPeca2 = entrada.nextDouble();

        ValorPagar = ((QuantPeca1*ValorPeca1)+QuantPeca2*ValorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ValorPagar);

        entrada.close();

    }

}