package fixacao_aula_05.exercicio02.application;

import fixacao_aula_05.exercicio02.entities.Contato;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Contato> contatos = new ArrayList<>();

        System.out.println("Criar novo contato: ");
        while(true){
            System.out.println("Deseja informar nome, telefone e email? (s/n)");
            char op = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            if(op == 's'){
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                contatos.add(new Contato(nome, telefone, email));
            }else{
                contatos.add(new Contato());
            }
            System.out.println("Deseja adicionar mais contatos? (s/n)");
            op = scanner.next().toLowerCase().charAt(0);
            if (op == 'n') {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Lista de contatos");

        for(Contato contato : contatos){
            System.out.println(contato);
        }

        System.out.println("Contatos cadastrados: " + contatos.size());

        for(Contato contato : contatos){
            if(contato.getNome().equalsIgnoreCase("Sem nome")){
                contatos.remove(contato);
            }
        }

        System.out.println("--- Lista atualizada ---");

        for(Contato contato : contatos){
            System.out.println(contato);
        }

        System.out.println("Contatos cadastrados: " + contatos.size());

        scanner.close();
    }
}
