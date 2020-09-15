package uri;

//import java.io.InterruptedIOException;
import java.util.Scanner;

public class Exer_02_04 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
               float salariobruto, prestacao, valorprestacao;
               

        System.out.print("Digite o valor do Salário Bruto: R$ ");
        salariobruto = in.nextFloat();
        
        System.out.print("Digite o valor da Prestação: R$ ");
        prestacao = in.nextFloat();

        valorprestacao = (salariobruto *0.3f);
        
        if(prestacao <= valorprestacao) {
            System.out.println("Aprovado empréstimo - Valor da prestação inferior a 30% do Salário Bruto - R$ " + prestacao);
        } else { System.out.println("Reprovado empréstimo - Valor da prestação superior a 30% do Salário Bruto - R$ " + prestacao);

        }
        
        in.close();
    }
    
}