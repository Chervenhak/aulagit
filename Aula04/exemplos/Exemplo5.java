package exemplos;

public class Exemplo5 {

    public static void main(String[] args) {
        linha();
        System.out.println(" Inicio do Programa");
        linha(); // chamada do metodo linha
    }
    // metodo 'linha' não tem retorno (void) e não tem parâmetro ()
    static void linha(){
        System.out.println("--------------------");
    }
}
