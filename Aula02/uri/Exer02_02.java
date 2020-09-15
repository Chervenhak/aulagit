package uri;

//import java.io.InterruptedIOException;
import java.util.Scanner;

public class Exer02_02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
               int nota;

        System.out.println("Digite um número: ");
       nota = in.nextInt();
        
        
        if(nota > 6) {
            System.out.println("Aprovado - " + (float)nota); // casting = conversão de tipo
        } else { System.out.println("Reprovado - " + (float)nota);

        }
        
        in.close();
    }
    
}