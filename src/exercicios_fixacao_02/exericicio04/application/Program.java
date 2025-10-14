package exercicios_fixacao_02.exericicio04.application;

import exercicios_fixacao_02.exericicio04.entities.Produto;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double preco;
        int quantidade;

        Produto produtos [] = new Produto[5];

        for(int i = 0; i < produtos.length; i++){
            System.out.print("Nome do produto: ");
            nome = scanner.nextLine();
            System.out.print("Preço: ");
            preco = scanner.nextDouble();
            System.out.print("Deseja inserir a quantidade em estoque? (s/n) ");
            char op = scanner.next().toLowerCase().charAt(0);
            if(op == 's'){
                System.out.print("Informe a quantidade em estoque: ");
                quantidade = scanner.nextInt();
                produtos[i] = new Produto(nome, preco, quantidade);
            }else{
                produtos[i] = new Produto(nome, preco);
            }
        }

        

        scanner.close();
    }
}
