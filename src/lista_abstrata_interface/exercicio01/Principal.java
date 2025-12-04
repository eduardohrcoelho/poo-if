package lista_abstrata_interface.exercicio01;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Gerente("Alice", 5000.00);
        Funcionario f2 = new Vendedor("Bob", 3000.00);
        funcionarios.add(f1);
        funcionarios.add(f2);
        SistemaSeguranca sistema = new SistemaSeguranca();
    }
}
