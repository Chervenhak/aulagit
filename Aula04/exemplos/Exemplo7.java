package exemplos;

public class Exemplo7 {

    public static void main(String[] args) {
        int resultado;

        resultado = soma(10, 50); //recebe o retorno do metodo variavel ´resultado´
        
        System.out.println("Resultado = " + resultado);

    }

    static int soma(int n1, int n2){
        int resp;
        resp = n1 + n2;

        return resp; // devolve o valor da variavel resp para quem chamou o metodo
    }

    
}
