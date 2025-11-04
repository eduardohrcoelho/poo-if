package fixacao_aula_08.exercicio01;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario func = new Funcionario("Carlos", 3000.00);
        System.out.println("\n1. Funcionário");
        func.exibeDados();

        System.out.println("\n-> Testando addAumento()...");
        func.addAumento(300.00);
        func.addAumento(-50.00);
        System.out.println("Salário final (deve ser 3300): R$" + String.format("%.2f", func.getSalario()));

        Assistente assist = new Assistente("Ana", 2500.00, 101);
        System.out.println("\n2.Assistente");
        assist.exibeDados();

        Tecnico tec = new Tecnico("Bruno", 3200.00, 202, 1000.00);
        System.out.println("\n3. Assistente Técnico");
        tec.exibeDados();

        Administrativo admDia = new Administrativo("Sofia", 2800.00, 303, "dia");
        System.out.println("\n4. Assistente Administrativo (DIA)");
        admDia.exibeDados();

        Administrativo admNoite = new Administrativo("Renato Borges", 2800.00, 304, "noite");
        System.out.println("\n5. Assistente Administrativo (NOITE)");
        admNoite.exibeDados();

        System.out.println("\n--- Testes Concluídos ---");
        scanner.close();

    }
}
