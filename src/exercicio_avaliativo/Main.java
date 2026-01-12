package exercicio_avaliativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Prova> provas = new ArrayList<>();

        int op = -1;

        System.out.println("---Iniciando Sistema de Correção automatica---");
        do{
            menu();
            op = scanner.nextInt();
            scanner.nextLine();
            switch(op) {
                case 1:
                    try{
                        System.out.println("Cadastrando prova objetiva");
                        System.out.print("Informe o nome do aluno: ");
                        String aluno = scanner.nextLine();
                        System.out.print("Informe a nota base: ");
                        double notaBase = scanner.nextDouble();
                        System.out.print("Informe o número de erros: ");
                        int erros = scanner.nextInt();
                        provas.add(new ProvaObjetiva(aluno, notaBase, erros));
                    }catch(IllegalArgumentException e){
                        System.out.println(e);
                    }
                    break;

                case 2:
                    try{
                        System.out.println("Cadastrando prova Discursiva");
                        System.out.print("Informe o nome do aluno: ");
                        String aluno = scanner.nextLine();
                        System.out.print("Informe a nota base: ");
                        double notaBase = scanner.nextDouble();
                        System.out.print("Informe o número de linhas: ");
                        int numeroLinhas = scanner.nextInt();
                        provas.add(new ProvaDiscursiva(aluno, notaBase, numeroLinhas));
                    }catch(IllegalArgumentException e2){
                        System.out.println(e2);
                    }
                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha uma opção entre 1 e 3");
                    break;
            }
        }while(op != 3);

        double somaNotas = 0;
        double menorNota = 10.0;
        double maiorNota = 0.0;

        for(Prova p : provas){
            double notaFinal = p.corrigir();

            somaNotas += notaFinal;

            if(maiorNota > notaFinal){
                maiorNota = notaFinal;
            }

            if(notaFinal < menorNota){
                menorNota = notaFinal;
            }

            if(p instanceof  Avaliavel && ((Avaliavel)p).podeReceberBonus()){
                System.out.println("Bônus aplicado: Sim (+0.5)");
            }else{
                System.out.println("Bônus aplicado: Não");
            }
            System.out.println(p);
        }

        double mediaGeral = 0;
        if(!provas.isEmpty()){
            mediaGeral = somaNotas/ provas.size();
        }

        int abaixoDaMedia = 0;
        for(Prova p : provas){
            if(p.corrigir() < mediaGeral){
                abaixoDaMedia++;
            }
        }

        System.out.println("--- Imprimindo ---");
        for(Prova p : provas){
            if(p instanceof Avaliavel){
                System.out.println("Bonus: + 0.5");
            }
            System.out.println(p);
        }

    }

    public static void menu(){
        System.out.println("\n1 - Cadastrar Prova Objetiva \n2 - Cadastrar Prova Discursiva \n3 - Sair");
    }

}
