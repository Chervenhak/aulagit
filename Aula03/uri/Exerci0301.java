package uri;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exerci0301 {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int numa, numb, numc, numd, somacd, somaab;
        // posso fazer uma expressão, onde eu crio com uma declaração boolean
        // boolean validar;

        numa = in.nextInt();
        numb = in.nextInt();
        numc = in.nextInt();
        numd = in.nextInt();

        somaab = (numa + numb);
        somacd = (numc + numd);

        // validar = (numb > numc) && (numd > numa) && (somacd > somaab) && (numc >=0)
        // && (numd >=0) && (numa%2 == 0)

        if (numb > numc && numd > numa && somacd > somaab && numc >= 0 && numd >= 0 && numa % 2 == 0) { // numa%2 -
                                                                                                        // retorna o
                                                                                                        // valor do
                                                                                                        // resto da
                                                                                                        // divisão e se
                                                                                                        // for 0 o
                                                                                                        // número é par
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");

        }
        in.close();

    }

}