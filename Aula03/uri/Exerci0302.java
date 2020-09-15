package uri;

import java.util.Scanner;
//import javax.lang.model.util.ElementScanner14;
public class Exerci0302 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valorqualquer;

        valorqualquer = in.nextFloat();

        if (valorqualquer < 0 || valorqualquer >= 100) {
            System.out.println("Fora de intervalo");
        } else {
            if (valorqualquer >= 0 && valorqualquer <= 25) {
                System.out.println("[0,25]");
            } else {
                if (valorqualquer > 25 && valorqualquer <= 50) {
                    System.out.println("(25,50]");
                } else {
                    if (valorqualquer > 50 && valorqualquer <= 75) {
                        System.out.println("(50,75]");
                    } else {
                        if (valorqualquer > 75 && valorqualquer <= 100) {
                            System.out.println("(75,100]");
                        }
                    }
                }
            }

        }
        in.close();

    }

}