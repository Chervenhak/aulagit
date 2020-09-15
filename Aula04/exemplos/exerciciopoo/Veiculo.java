package exemplos.exerciciopoo;

public class Veiculo
 {
    
    String modelo;
    String marca;
    double consumo; // (quantos KM/L)

    public Veiculo(String marca, String modelo, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }
    String exibirDados() {
        return marca + " | Modelo: " + modelo + " | ";
    }
    double consumo(){
        return consumo;
    }
    
}