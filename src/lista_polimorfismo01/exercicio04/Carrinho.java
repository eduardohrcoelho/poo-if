package lista_polimorfismo01.exercicio04;

import java.util.*;

public class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public void adicionarProduto(String nome, double preco){
        produtos.add(new Produto(nome, preco));
    }

    public void adicionarProduto(String nome, double preco, double taxaImportacao){
        produtos.add(new ProdutoImportado(nome, preco, taxaImportacao));
    }

    public void calcularTotal(){
        double total = 0.0;

        for(Produto produto : produtos){
            total += produto.calcularPrecoFinal();
            System.out.println(produto);
        }

        System.out.printf("Total da compra: %.2f", total);
    }
}
