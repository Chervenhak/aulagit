package uri;

import java.util.Scanner;
//import java.util.SortedMap;

public class Exerci030304 {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int numero, resultado, cont, par, impar;
        cont = 1;
        par = 0;
        impar = 0;

        while (cont <= 10) {
            System.out.print("Digite o " + cont + "º número: ");
            numero = in.nextInt();
            cont++;
            resultado = numero % 2;
            if (resultado == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de Números Pares: " + par);
        System.out.println("Quantidade de Números Impar: " + impar);
        in.close();
    }

}