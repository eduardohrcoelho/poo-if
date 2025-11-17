package lista_polimorfismo01.exercicio02;

public class Onibus extends Transporte{
    private int quantParadas;

    public Onibus(int capacidade, double valorBase, int quantParadas){
        super(capacidade, valorBase);
        this.quantParadas = quantParadas;
    }

    @Override
    public double calcularTarifa(){
        return this.valorBase + (this.quantParadas * 0.50);
    }

    public String toString(){
        return "\nTipo de Transporte: Onibus\n" + super.toString();
    }
}
