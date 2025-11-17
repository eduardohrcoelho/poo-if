package lista_polimorfismo01.exercicio02;

public class Transporte {
    private int capacidade;
    protected double valorBase;

    public Transporte(int capacidade, double valorBase) {
        this.capacidade = capacidade;
        this.valorBase = valorBase;
    }

    public double calcularTarifa(){
        return this.valorBase;
    }

    @Override
    public String toString(){
        return "Tarifa: R$" + String.format("%.2f", this.valorBase);
    }
}
