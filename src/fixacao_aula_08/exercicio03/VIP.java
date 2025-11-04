package fixacao_aula_08.exercicio03;

public class VIP extends Ingresso{
    protected double valorAdicional;

    public VIP(double valorBase, double valorAdicional) {
        super(valorBase); // Chama o construtor da classe-pai (Ingresso)
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional(){
        return this.valorAdicional;
    }

    public double getValorTotal() {
        return this.valor + this.valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso VIP: R$ " + getValorTotal());
    }
}
