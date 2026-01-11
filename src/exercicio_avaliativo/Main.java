package exercicio_avaliativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<ProvaObjetiva> objetivaList = new ArrayList<>();
        List<ProvaDiscursiva> discursivaList = new ArrayList<>();

        int op = -1;

        System.out.println("---Iniciando Sistema de Correção automatica---");
        do{
            menu();
            op = scanner.nextInt();
            scanner.nextLine();
            switch(op) {
                case 1:
                    System.out.println("Cadastrando prova objetiva");
                    System.out.print("Informe o nome do aluno: ");
                    String aluno = scanner.nextLine();
                    System.out.print("Informe a nota base: ");
                    double notaBase = scanner.nextDouble();
                    System.out.print("Informe o número de erros: ");
                    int erros = scanner.nextInt();

                    objetivaList.add(new ProvaObjetiva(aluno, notaBase, erros));
                    break;

                case 2:
                    System.out.println("Cadastrando prova Discursiva");
                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha uma opção entre 1 e 3");
                    break;
            }



        }while(op != 3);


        System.out.println("--- Imprimindo ---");
        for(ProvaObjetiva objetiva : objetivaList){
            System.out.println(objetiva);
        }

    }

    public static void menu(){
        System.out.println("\n1 - Cadastrar Prova Objetiva \n2 - Cadastrar Prova Discursiva \n3 - Sair");
    }

}
