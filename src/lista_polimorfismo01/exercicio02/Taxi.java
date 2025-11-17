package lista_polimorfismo01.exercicio02;

public class Taxi extends Transporte{
    private double quilometragem;

    public Taxi(int capacidade, double valorBase, double quilometragem){
        super(capacidade, valorBase);
        this.quilometragem = quilometragem;
    }

    @Override
    public double calcularTarifa(){
        return this.valorBase + (this.quilometragem + 2.00);
    }

    public String toString(){
        return "\nTipo de Transporte: Taxi\n" + super.toString();
    }
}
