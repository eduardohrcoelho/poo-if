package lista_polimorfismo01.exercicio03;

public class DespesaViagem extends Despesa{
    private double valorPassagem;
    private double valorHospedagem;

    public DespesaViagem(String descricao, double valor, double valorPassagem, double valorHospedagem){
        super(descricao, valor);
        this.valorPassagem = valorPassagem;
        this.valorHospedagem = valorHospedagem;
    }
}
