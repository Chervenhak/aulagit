import java.util.Scanner;

public class Exerc02_08 copy {

    public static void main(String[] args) {
          // Declaração de variáveis
          Scanner in = new Scanner(System.in);
          int lado1, lado2, lado3, temostriangulo;// Declação de variáveis que receberão os dados
          //double area;// variáveis de cálculos
          
          // Entrada de dados - Lado A do Triângulo
          System.out.print("Digite o tamanho do Lado A do Triângulo: ");
          lado1 = in.nextInt();
          
          // Entrada de dados - Lado B do Triângulo
          System.out.print("Digite o tamanho do Lado B do Triângulo: ");
          lado2 = in.nextInt();

          // Entrada de dados - Lado C do Triângulo
          System.out.print("Digite o tamanho do Lado C do Triângulo: ");
          lado3 = in.nextInt();          
          
          temostriangulo = (lado1 <= lado2 + lado3) &&
                           (lado2 <= lado1 + lado3) &&
                           (lado3 <= lado1 + lado2);

          if(temostriangulo) {
              if (lado1 == lado2 && lado3){
                  System.out.println("Equilatero");
              }else {
                  if(lado1== lado2 || lado1 == lado3 || lado2 == lado3) {
                      System.out.println("Isoceles");
                    else{
                        System.out.println("Escaleno");
                    }
                  }
              }else{
                  System.out.println("Não temos triângulo");
              }
          
          // Saída de dados
          //System.out.println("O valor da Área do Triangulo é : " + area);
          
          
    in.close();




    }
}