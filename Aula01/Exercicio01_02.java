import java.util.Scanner;

public class Exercicio01_02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2;// variável para ler a nota 1 do aluno que será digitado
        // int nota2;   // variável para ler a nota 2 do aluno que será digitado
        // Entrada de Dados

        System.out.println("Digite a nota 1 do aluno:");
        nota1 = entrada.nextDouble(); //leitura de String da nota 1 do aluno

        System.out.println("Digite a nota 2 do aluno:");
        nota2 = entrada.nextDouble(); //leitura de String da nota 2 do aluno
     
        System.out.println("A média do Aluno é: " + (nota1 + nota2) / 2);

        entrada.close();

    }
    
}
