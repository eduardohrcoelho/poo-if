package exercicios_fixacao_02.exericicio04.entities;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(){}

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.estoque = 10;
    }

    public void vender(int quantidade){
        if(quantidade > estoque){
            System.out.println("Estoque insuficiente!");
        }else{
            estoque -= quantidade;
        }
    }

    public void repor(int quantidade){
        estoque += quantidade;
    }

    public double calcularValorTotal(){
        return preco * estoque;
    }

    public static void menorQuant(Produto [] produtos){
        int indice = 0;
        int menor = 0;

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i].estoque < menor){
                indice = i;
                menor = produtos[i].estoque;
            }
        }

        System.out.println("Produto com menor quantidade disponíve: " + produtos[indice].nome);
    }
}
