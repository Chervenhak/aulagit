package uri;

//import java.io.InterruptedIOException;
import java.util.Scanner;

import sun.tools.tree.EqualExpression;

public class Exer_02_05 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
              String senha;
              String validarsenha;

        System.out.print("Digite a senha de acesso: ");
        senha = in.nextLine();

        validarsenha = "R10p5";
        
        if(senha.equals(validarsenha)) {
                    System.out.println("Senha Correta - Acesso concedido");
        } else { System.out.println("Senha incorreta - Acesso negado");

        }
        
        in.close();
    }
    
}