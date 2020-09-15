package uri;

//import java.io.InterruptedIOException;
import java.util.Scanner;

public class Exer_Media_02_03 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
               float n1, n2;
               

        System.out.println("Digite o primeiro número: ");
        n1 = in.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextFloat();
        
       if(n1 >= n2) {
            System.out.println("Número 1 - " + n1 + " Número 2 - " + n2);
        } else { System.out.println("Número 2 - " + n2 + " Número 1 - " + n1);

        }
        
        in.close();
    }
    
}