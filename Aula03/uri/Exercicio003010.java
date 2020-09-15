package uri;

import java.util.Scanner;

public class Exercicio003010 {
    public static void main(final String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, mediaAluno, mediaSala;
        final int NUM_ALUNOS = 2;
        

        for (int aluno = 1; aluno NUM_ALUNOS; aluno++) {
            
            do {
                System.out.println("Digite a 1ª nota de (0 a 10) do Aluno " + aluno + ": ")
            nota1 = teclado.nextInt();
            } while (nota1 < 0 || nota1 > 10);
            
                        
            do {
                System.out.println("Digite a 2ª nota de (0 a 10) do Aluno " + aluno + ": ")
            nota1 = teclado.nextInt();
            } while (nota2 < 0 || nota2 > 10);

            System.out.println("Digite a 2ª nota do aluno ");
            nota2 = teclado.nextInt();
            
            mediaAluno = (nota1 + nota2) / 2;
            mediaSala = mediaSala + mediaAluno;
            System.out.println("Media do Aluno " + aluno + ": " + mediaAluno);
        }

        System.out.println("Media da Classe é " + mediaSala / NUM_ALUNOS);
        in.close();
    }
}