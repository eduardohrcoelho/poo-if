package fixacao_aula_08.exercicio03;

public class CamaroteSuperior extends VIP{
    public CamaroteSuperior(double valorBase, double valorAdicional) {
        super(valorBase, valorAdicional);
    }

    @Override
    public double getValorTotal() {
        return this.valor + this.valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do Camarote Superior: R$ " + getValorTotal());
    }
}
