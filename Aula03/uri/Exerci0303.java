package uri;

import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;
public class Exerci0303 {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        float salario, reajuste, novosalario;

        salario = in.nextFloat();

        if (salario > 0 && salario <= 400) {
            novosalario = (float) (salario * 1.15);
            reajuste = novosalario - salario;
            System.out.printf("Novo salario: %.2f\n", novosalario);
            System.out.printf("Reajuste ganho  %.2f\n", reajuste);
            System.out.println("Em percentual: 15%");
        } else {
            if (salario > 400 && salario <= 800) {
                novosalario = (float) (salario * 1.12);
                reajuste = novosalario - salario;
                System.out.printf("Novo salario: %.2f\n", novosalario);
                System.out.printf("Reajuste ganho %.2f\n", reajuste);
                System.out.println("Em percentual: 12%");
            } else {
                if (salario > 800 && salario <= 1200) {
                    novosalario = (float) (salario * 1.10);
                    reajuste = novosalario - salario;
                    System.out.printf("Novo salario: %.2f\n", novosalario);
                    System.out.printf("Reajuste ganho %.2f\n", reajuste);
                    System.out.println("Em percentual: 10%");
                } else {
                    if (salario > 1200 && salario <= 2000) {
                        novosalario = (float) (salario * 1.07);
                        reajuste = novosalario - salario;
                        System.out.printf("Novo salario: %.2f\n", novosalario);
                        System.out.printf("Reajuste ganho %.2f\n", reajuste);
                        System.out.println("Em percentual: 7%");
                    } else {
                        if (salario > 2000) {
                            novosalario = (float) (salario * 1.04);
                            reajuste = novosalario - salario;
                            System.out.printf("Novo salario: %.2f\n", novosalario);
                            System.out.printf("Reajuste ganho %.2f\n", reajuste);
                            System.out.println("Em percentual: 4%");
                        }
                    }
                }
            }

        }
        in.close();

    }

}