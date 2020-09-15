package uri;

//import java.io.InterruptedIOException;
import java.util.Scanner;

public class Exer02_01 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        //float a, valor;
        int a, valor;

        System.out.println("Digite um número: ");
        //a = in.nextFloat();
        a = in.nextInt();
        
        
        if(a > 20) {
            valor = a / 2;  // colocar a conta sempre dentro da condicional para executar apenas se for necessário
            System.out.println("Esse é o valor da metade do número digitado " + (float)valor); // casting = conversão de tipo
        }
        in.close();
    }
    
}