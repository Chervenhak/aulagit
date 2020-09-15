package exemplos;

import java.util.Scanner;

import javax.xml.validation.Validator;

public class Exercicio0401 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        try {
            System.out.print("Digite um número inteiro: ");
            numero = Integer.parseInt(teclado.nextLine());

            retorno = ehPar(valor);
        }catch(Exception e){
            System.out.print("Entrada inválida!");
        }

        String resultado;

        System.out.println("Digite o numero inteiro: ");
        n = in.nextInt();
        resultado = consultaPar(n);
        System.out.println("O número " + resultado);
    }
    static string consultaPar(int numero){
            String resp;
            if(numero%2==0){
                resp = "é Par";
            } else {
                resp = "é impar";
            }
    }
                    /*
                    try {
                        System.out.print("Digite um número inteiro: ");
                        numero = teclado.nextInt();
                        System.out.println(numero);
                    }catch(Exception e){
                        System.out.print("Entrada inválida!");
                    }
                    */
        teclado.close();
}
