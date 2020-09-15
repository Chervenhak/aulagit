package exemplos;

import java.util.Scanner;

/**
*/

public class Exemplo03A {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int idade;
        string nome;
        
        System.out.println("Digite a sua idade: ");
        //idade = teclado.nextInt();
        idade = Integer.parseInt(teclado.nextInt()); // converto para a string para inteiro
        System.out.println("Digite o seu nome");
        nome = teclado.nextInt();

        System.out.println("Seus dados: " + nome + ":" + idade);

        teclado.close();
    }
} 