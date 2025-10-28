package fixacao_aula_06.application;

import fixacao_aula_06.entities.Pedido;
import fixacao_aula_06.entities.Gerenciador;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerenciador gerenciador = new Gerenciador();

        Pedido p1 = new Pedido("Notebook", 1, 1600.00, "Preparando");
        Pedido p2 = new Pedido("Televisão", 2, 2400.00, "Preparando");
        Pedido p3 = new Pedido("Iphone 15", 3, 6600.00, "Pronto para entrega");
        Pedido p4 = new Pedido("Notebook", -1, -1600.00, "Preparando");

        gerenciador.adicionar(p1);
        gerenciador.adicionar(p2);
        gerenciador.adicionar(p3);

        gerenciador.listar();

        gerenciador.removerPedido(2);
        gerenciador.listar();
        Pedido achou = gerenciador.buscaPedidoNome("Notebook");
        if(achou != null){
            System.out.println("Pedido encontrado: " + achou.getNome());
        }
        achou = gerenciador.buscarId(2);
        if(achou != null){
            System.out.println("Pedido encontrado: " + achou.getNome());
        }

        gerenciador.atualizarValor(2, 2000);
        gerenciador.listar();
        scanner.close();
    }


    public static void menu(){
        System.out.println("\n--- Escolha uma opção ---\n1. Adicionar novo pedido \n2. Listar todos pedidos \n3. Buscar pedido por ID ou Nome \n4. Remover pedido \n5. Sair");
    }



}
