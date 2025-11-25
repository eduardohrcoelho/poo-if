package lista_polimorfismo01.exercicio04;

public class Principal {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto("Celular", 3200);
        carrinho.adicionarProduto("Tenis", 1000, 120);
        Produto p1 = new Produto("Camisa", 100);
        carrinho.adicionarProduto(p1);

        carrinho.calcularTotal();
    }
}
