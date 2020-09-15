package uri;

import java.util.Scanner;

public class Exerc_uri_04 {

    public static void main(final String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor;
        int divisao, resto;
        int nota1, nota2, nota5, nota10, nota20, nota50, nota100;
        
        nota1 = 1;
        nota2 = 2;
        nota5 = 5;
        nota10 = 10;
        nota20 = 20;
        nota50 = 50;
        nota100 = 100;
        
        valor = entrada.nextInt();
        

        System.out.println(valor);

        divisao = valor / nota100;
        resto = valor % 100;
        System.out.printf("%d notas(s) de R$ 100,00\n", divisao);

        divisao = resto / nota50;
        resto = resto % 50;
        System.out.printf("%d notas(s) de R$ 50,00\n", divisao);

        divisao = resto / nota20;
        resto = resto % 20;
        System.out.printf("%d notas(s) de R$ 20,00\n", divisao);

        divisao = resto / nota10;
        resto = resto % 10;
        System.out.printf("%d notas(s) de R$ 10,00\n", divisao);

        divisao = resto / nota5;
        resto = resto % 5;
        System.out.printf("%d notas(s) de R$ 5,00\n", divisao);

        divisao = resto / nota2;
        resto = resto % 2;
        System.out.printf("%d notas(s) de R$ 2,00\n", divisao);

        divisao = resto / nota1;
        resto = resto % 1;
        System.out.printf("%d notas(s) de R$ 1,00\n", divisao);

        entrada.close();

    }

}