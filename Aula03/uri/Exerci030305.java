package uri;

import java.util.Scanner;
//import java.util.SortedMap;

public class Exerci030305 {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int valor, soma = 0, cont;
        valor = 1;
        cont = 1;

        while (valor != 0) {
            System.out.print("Digite o " + cont + "º número inteiro ( 0 = fim ):");
            valor = in.nextInt();
            soma += valor;
            cont++;
        }
        System.out.println("A soma dos valores é: " + soma);
        in.close();
    }
}