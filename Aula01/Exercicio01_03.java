import java.util.Scanner;

public class Exercicio01_03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String Nome;
        double SalarioAtual;// variável para receber o salário atual
        double Aumento;// variável para receber o valor do aumento

        System.out.print("Digite o seu nome: ");
        Nome = entrada.nextLine();

        System.out.print("Digite o Salário Atual: R$ ");
        SalarioAtual = entrada.nextDouble();

        Aumento = (SalarioAtual *1.25);

        System.out.println("Olá " + Nome + ", seu nome novo salário é de: R$ " + Aumento);
        
        entrada.close();

    }
    
}