import java.util.Scanner;

public class Exercicio01_06 {
  
public static void main(String[] args) {
    
    // Declaração de variáveis
    Scanner entrada = new Scanner(System.in);
    double Base, Altura;// Declação de variáveis que receberão os dados
    double Area;// variáveis de cálculos
    
    // Entrada de dados - Base Triângulo    
    System.out.print("Digite a Base do Triângulo: ");
    Base = entrada.nextDouble();
    
    // Entrada de dados - Altura Triângulo    
    System.out.print("Digite a Base do Triângulo: ");
    Altura = entrada.nextDouble();

    // Processamento dos valores

    Area = (Altura * Base) / 2;
    
    // Saída de dados

    
    System.out.println("O valor da Área do Triangulo é : " + Area);
            
    entrada.close();

    }

}