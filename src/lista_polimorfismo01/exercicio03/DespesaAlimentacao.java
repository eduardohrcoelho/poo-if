package lista_polimorfismo01.exercicio03;

public class DespesaAlimentacao extends Despesa{
    private double gorjeta;

    public DespesaAlimentacao(String descricao, double valor, double gorjeta){
        super(descricao, valor);
        this.gorjeta = gorjeta;
    }
}
