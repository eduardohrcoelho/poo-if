package exercicios_fixacao_01.exercicio01.entities;

public class Produto {
    public String nome;
    private double preco;
    private int quantidade;

    public Produto(){
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public void verificarEstoque(){
        System.out.println("Produto: " + getNome() + " \nEstoque: " + getQuantidade());
    }

}
