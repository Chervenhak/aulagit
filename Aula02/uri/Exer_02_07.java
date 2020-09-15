package uri;

import java.io.InterruptedIOException;
import java.util.Scanner;

import sun.tools.tree.EqualExpression;

public class Exer_02_07 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
               float salario;
               

        System.out.print("Digite o valor do Salário: R$ ");
        salario = in.nextFloat();
        
       if(salario > 2000) {
            System.out.println("Desconto do INSS será de 30% do seu Salário");
        } else { if(salario < 2000) {
                System.out.println("Valor a ser pago ao INSS é de 25% do seu Salário");
                }else { if(salario < 1200) {
                    System.out.println("Valor a ser pago ao INSS é de 20% do seu Salário");
                    else { System.out.println("Você está ISENTO do desconto do INSS"); } 
                            }   
                        }
                }
        in.close();
    }
    
}