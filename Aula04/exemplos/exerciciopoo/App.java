package exemplos.exerciciopoo;

public class App {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Gurgel", "BR800", 9.7);
        Veiculo veiculo2 = new Veiculo("Gurgel", "Carajás", 7.6);

        System.out.println(veiculo1.exibirDados() );

       /* veiculo1.marca = "Gurgel";
        veiculo1.modelo = "BR800";
        veiculo1.consumo = 9.7;

        veiculo2.marca = "Gurgel";
        veiculo2.modelo = "Carajás";
        veiculo2.consumo = 7.6;*/

        System.out.println( veiculo1.exibirDados() );
        System.out.println("O consumo do carro 1 é" + veiculo1.consumo() + " KM/L");
        System.out.println( veiculo2.exibirDados() );
        System.out.println("O consumo do carro 2 é" + veiculo2.consumo() + " KM/L");
    }
    
}