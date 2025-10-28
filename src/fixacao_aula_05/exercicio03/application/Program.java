package fixacao_aula_05.exercicio03.application;

import fixacao_aula_05.exercicio03.entities.Pedido;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pedido> pedidos = new ArrayList<>();

        Pedido p1 = new Pedido(1, "João", 200.00);
        Pedido p2 = new Pedido();
        Pedido p3 = new Pedido();
        Pedido p4 = new Pedido(4, "Maria", 320.00);
        Pedido p5 = new Pedido(5, "José", 120.00);
        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);
        pedidos.add(p4);
        pedidos.add(p5);

        double aumento = aumento(p1.getValor());
        p1.setValor(aumento);

        for(Pedido pedido : pedidos){
            System.out.println(pedido);
        }

        double soma = 0.0;
        for(Pedido pedido : pedidos){
            soma += pedido.getValor();
        }

        System.out.println("Pedidos cadastrados: " + pedidos.size() + "\nSoma dos pedidos: R$" + soma);
        scanner.close();
    }

    public static double aumento(double valor){
        return valor * 0.10;
    }
}
