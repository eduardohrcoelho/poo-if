package lista_polimorfismo01.exercicio04;

public class ProdutoImportado extends Produto{
    private double taxaImportacao;
    public ProdutoImportado(String nome, double preco, double taxaImportacao){
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double calcularPrecoFinal(){
        return this.preco + this.taxaImportacao;
    }

    public String toString(){
        return super.toString() + "\nTaxa de importação: R$" + this.taxaImportacao;
    }
}
