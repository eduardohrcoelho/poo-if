package lista_herenca_02.exercicio03;

public class ProdutoImportado extends Produto{
    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String toString() {
        return super.toString() + " Taxa: R$" + String.format("%.2f", this.taxaImportacao);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ProdutoImportado other = (ProdutoImportado) obj;
        return Double.compare(this.taxaImportacao, other.taxaImportacao) == 0;
    }
}
