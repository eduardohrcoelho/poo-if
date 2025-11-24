package lista_polimorfismo01.exercicio03;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        List<Despesa> despesas = new ArrayList<>();
        despesas.add(new Despesa("Carregador de celular", 100.00));
        despesas.add(new DespesaAlimentacao("Almoço", 65.00, 12.00));
        despesas.add(new DespesaViagem("Viagem Piuma", 300.00, 120.00, 100.00));

        for(Despesa despesa : despesas){
            System.out.println(despesa);
        }

    }
}
