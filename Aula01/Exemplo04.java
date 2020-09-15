import java.util.Scanner;

public class Exemplo04 {
    
    public static void main(String[] args) {
                
        Scanner entrada = new Scanner(System.in);
        String nome; // variável para ler o nome que será digitado
        int idade;   // variável para ler a idade que será digitado

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine(); //leitura de Sting digitada pelo usuário

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();

        //System.out.println("Olá " + nome);
        System.out.print("Olá " + nome + " você tem " + idade + " anos.");

        //System.out.println("Olá " + nome);
        //System.out.print("Olá " + nome);
        
        entrada.close();
        
    }
}
