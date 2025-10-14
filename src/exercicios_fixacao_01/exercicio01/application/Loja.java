package exercicios_fixacao_01.exercicio01.application;

import exercicios_fixacao_01.exercicio01.entities.Produto;

import java.util.*;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Informe a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.print("Informe a quantidade a ser adicionada no estoque: ");
        quantidade = scanner.nextInt();
        produto.setEstoque(quantidade);
        produto.verificarEstoque();
        System.out.println("Informe a quantidade a ser retirada do estoque");
        produto.removerEstoque(scanner.nextInt());
        produto.verificarEstoque();



        scanner.close();
    }
}
