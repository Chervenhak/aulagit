package exemplos;

import java.util.Scanner;

public class Exercicio040B {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String resultado;
        
        try {
            System.out.print("Digite um número inteiro: ");
            numero = teclado.nextInt();
            System.out.println(numero);
        }catch(Exception e){
            System.out.print("Entrada inválida!");
        }

        
        teclado.close();
    }

}
