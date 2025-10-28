package fixacao_aula_06.entities;

import java.util.*;

public class Gerenciador{
    private List<Pedido> pedidos;

    public Gerenciador(){
        this.pedidos = new ArrayList<>();
    }

    public void adicionar(Pedido pedido){
        if(buscarId(pedido.getId()) != null){
            System.out.println("Erro: Id já existente");
            return;
        }
        this.pedidos.add(pedido);
        System.out.println("Pedido " + pedido.getNome() + " adicionado com sucesso!");
    }


    public void listar(){
        System.out.println("\n--- Lista ---");
        for(Pedido pedido : pedidos){
            System.out.println(pedido);
        }
    }

    public void removerPedido(int indice){
        this.pedidos.remove(indice);
    }

    public Pedido buscaPedidoNome(String nome){
        for(Pedido pedido : pedidos){
            if(pedido.getNome().equalsIgnoreCase(nome)){
                return pedido;
            }
        }
        return null;
    }

    public Pedido buscarId(int id){
        for(Pedido pedido : pedidos){
            if(pedido.getId() == id){
                return pedido;
            }
        }
        return null;
    }

}
