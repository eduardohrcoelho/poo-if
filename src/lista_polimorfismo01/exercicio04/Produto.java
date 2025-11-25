package lista_polimorfismo01.exercicio04;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal(){
        return this.preco;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nPreço: R$" + this.preco;
    }
}
