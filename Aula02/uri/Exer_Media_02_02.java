package uri;

//import java.io.InterruptedIOException;
import java.util.Scanner;

public class Exer_Media_02_02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
               float nota1, nota2, media;
               float peso1, peso2, pesonota1, pesonota2;

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = in.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = in.nextFloat();
        
        pesonota1 = 0.4f;
        pesonota2 = 0.6f;

        peso1 = nota1 * pesonota1;
        peso2 = nota2 * pesonota2;
        

        media = peso1 + peso2;
        
        if(media >= 6) {
            System.out.println("Aprovado - " + media);
        } else { System.out.println("Reprovado - " + media);

        }
        
        in.close();
    }
    
}