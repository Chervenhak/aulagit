import java.util.Scanner;

public class Exercicio01_05_EPaduan {
  
public static void main(String[] args) {
    
    // Declaração de variáveis
    Scanner entrada = new Scanner(System.in);
    double Pe, Jarda, Milha, KM;// Declação de variáveis que receberão os dados
    double ValorKM;// Declação de variável que receberá o medida em KM
    double CalculoPe, CalculoJarda, CalculoMilha, CalculoPolegadas, CalculoKM;// variáveis de cálculos
    
    // Entrada de dados - ValorKM    
    System.out.print("Digite a quantidade de KM que deseja converter: ");
    ValorKM = entrada.nextDouble();
    
     // Processamento dos valores

    CalculoPe = ValorKM * 3280.84;
    CalculoJarda = ValorKM * 1093.61;
    CalculoPolegadas = ValorKM * 39370.1;
    CalculoMilha = ValorKM * 0.621371;
    

    // Saída de dados

    
    System.out.println(" O valor de KM para Pés é de: " + CalculoPe);
    System.out.println(" O valor de KM para Jardas é de: " + CalculoJarda);
    System.out.println(" O valor de KM para Polegadas é de: " + CalculoPolegadas);
    System.out.println(" O valor de KM para Milhas é de: " + CalculoMilha);
    
        
    entrada.close();

    }

}