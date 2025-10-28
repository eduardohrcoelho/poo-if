package fixacao_aula_06.application;

import fixacao_aula_06.entities.Pedido;
import fixacao_aula_06.entities.Gerenciador;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pedido> pedidos = new ArrayList<>();
        Gerenciador gerenciador = new Gerenciador();
        int op;
        do{
            menu();
            op = scanner.nextInt();
            scanner.nextLine();
            switch(op){
                case 1:
                    System.out.print("Nome do pedido: ");
                    String nome = scanner.nextLine();
                    System.out.print("ID do pedido: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Status: ");
                    String status = scanner.nextLine();
                    pedidos.add(new Pedido(nome, id, valor, status));
                    break;

                case 2:
                    for(Pedido pedido : pedidos){
                        System.out.println(pedido);
                    }
                    break;

                case 3:
                    System.out.println("Escolha uma opção: \n1 - Buscar por ID \n2 - Buscar por nome ");
                    int op2 = scanner.nextInt();
                    scanner.nextLine();
                    if(op2 == 1){
                        System.out.print("Informe o ID do pedido que está procurando (Apenas números): ");
                        int idBusca = scanner.nextInt();

                    }else if(op2 == 2){
                        System.out.print("Informe o nome do pedido que está procurando: ");
                        nome = scanner.nextLine();
                        Pedido pedido = gerenciador.buscaPedidoNome(nome);
                        System.out.println(pedido);
                    }

                    break;

                case 4:
                    System.out.println("Remover");
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }while(op != 5);



        scanner.close();
    }


    public static void menu(){
        System.out.println("\n--- Escolha uma opção ---\n1. Adicionar novo pedido \n2. Listar todos pedidos \n3. Buscar pedido por ID ou Nome \n4. Remover pedido \n5. Sair");
    }



}
