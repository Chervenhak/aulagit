package exemplos;

import java.util.Scanner;

public class Exercicio0402 {
    public static void main(String[] args) {
        
        int num1, num2, num3, resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1º número");
        num1 = teclado.nextInt();
        System.out.println("Digite 2º número");
        num2 = teclado.nextInt();
        System.out.println("Digite 3º número");
        num3 = teclado.nextInt();
        
        resultado ehMenor (num1, num2, num3);

        if (resultado == 1){
            System.out.println("O menor número é %d" + num1);
        } else
            if (resultado == 2) {
                System.out.println("O menor número é %d" + num2);
                } else {
                    System.out.println("O número maior é %d" + num3);
                }
                teclado.close();
     
    //criação do metodo

    static int ehMenor (int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            return 1;
            }
            else
            if (n2 < n1 && n2 <n3) {
                return 2;
            } else {
                return 3;
            }
    }
                
    }
}
