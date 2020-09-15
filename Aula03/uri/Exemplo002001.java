package uri;

import java.util.Scanner;

public class Exemplo002001 {
    public static void main(final String[] args) {
        final Scanner entrada = new Scanner(System.in);
        int cont;
        double nota, soma, media;
        final int QTDENOTAS = 3;

        soma = 0;
        conta = 1;

        while (cont <= QTDENOTAS) {
            System.out.printf("Digite a nota (%d / %d): ", cont, QTDENOTAS);
            nota = entrada.nextDouble();
            soma = soma + nota;
            cont++;
        }

        media = soma / QTDENOTAS;
        System.out.printf("A média das notas é: %.2f\n", media);

        entrada.close();
    }

}
