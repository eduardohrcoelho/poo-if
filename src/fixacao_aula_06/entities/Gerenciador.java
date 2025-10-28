package fixacao_aula_06.entities;

import java.util.*;

public class Gerenciador{
    private List<Pedido> pedidos;

    public Gerenciador(){
        this.pedidos = new ArrayList<>();
    }

    public Pedido buscaPedidoNome(String nome){
        for(Pedido pedido : pedidos){
            if(pedido.getNome().equalsIgnoreCase(nome)){
                return pedido;
            }
        }
        return null;
    }

}
