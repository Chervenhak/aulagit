package uri;

import java.util.Scanner;
//import java.util.SortedMap;

public class Exerci030302 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int numero, multiplicador, resultado;

        System.out.print("Digite o número que deseja saber a tabuada: ");
        numero = in.nextInt();

        multiplicador = 0;

        while (multiplicador <= 10) {

            resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
        in.close();
    }

}