import java.util.Scanner;

public class Exercicio01_04 {
  
public static void main(String[] args) {
    
    // Declaração de variáveis
    Scanner entrada = new Scanner(System.in);
    String Nome; // Variável para receber o nome
    double SalarioMinimo, KWatt;// variável para receber o salário minimo e o KiloWatt utilizado
    double ValorKWatt;// variável para receber o valor do KWatt
    double ValorPago;// variável para receber o valor a ser pago
    double ValorPagoDesc;// variável para receber o valor a ser pago com desconto de 15%

    // Entrada de dados - Nome    
    System.out.print("Digite o seu nome: ");
    Nome = entrada.nextLine();
    
    // Entrada de dados - Salário Minimo  
    System.out.print("Digite o valor do Salário Minimo: R$ ");
    SalarioMinimo = entrada.nextDouble();

    // Entrada de dados - Total de KilloWatts
    System.out.print("Digite o total de KiloWatts gastos no mês: ");
    KWatt = entrada.nextDouble();

    // Processamento dos valores
    ValorKWatt = SalarioMinimo / 500;
    ValorPago = ValorKWatt * KWatt;
    ValorPagoDesc = ValorPago - (ValorPago * 0.15);

    // Saída de dados

    System.out.println("*******************************************************************");
    System.out.println("                        Olá " + Nome );
    System.out.println("*******************************************************************");
    System.out.println("   O valor do Kilowatt é de: R$ " + ValorKWatt);
    System.out.println(" ");
    System.out.println("   O valor a ser pago em reais por sua residência é de: R$ " + ValorPago);
    System.out.println(" ");
    System.out.println("   O valor a ser pago com desconto de 15% é de: R$ " + ValorPagoDesc);
    System.out.println("*******************************************************************");
    entrada.close();

    }

}
