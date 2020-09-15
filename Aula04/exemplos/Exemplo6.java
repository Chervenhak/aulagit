package exemplos;

public class Exemplo6 {

    public static void main(String[] args) {
        linha(10);
        System.out.println("Inicio do Programa");
        char escolha = '*';
        //linha2(20, '*'); // chamada do metodo linha
        linha2(20, escolha); // chamada do metodo linha com a variavel que foi digitada
    }
    // metodo 'linha' não tem retorno (void) e com um parâmetro (int tamanho)
    static void linha(int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();

    }
    // metodo 'linha' não tem retorno (void) e com um parâmetro (int tamanho)
    static void linha2(int tamanho, char tipo){
        for(int i = 0; i < tamanho; i++){
            System.out.print(tipo);
        }
        System.out.println();
    }

    
}
