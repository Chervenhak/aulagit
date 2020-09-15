package uri;

import java.util.Scanner;

public class Exemplo_Condicional {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        float nota;

        System.out.println("Digite a nota: ");
        nota = in.nextFloat();

        if(nota >= 6) {
            System.out.println("Aluno Aprovado com " + nota);
        }
        in.close();
    }
    
}
