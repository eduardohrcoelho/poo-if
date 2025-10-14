package exercicios_fixacao_02.exercicio03.application;

import exercicios_fixacao_02.exercicio03.entities.Aluno;

import java.util.*;

public class Program {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String nome;
       double nota1, nota2;

       Aluno alunos [] = new Aluno[4];

       for(int i = 0; i < alunos.length; i++){
           System.out.print("Nome: ");
           nome = scanner.nextLine();
           System.out.print("Nota 1: ");
           nota1 = scanner.nextDouble();
           System.out.print("Nota 2: ");
           nota2 = scanner.nextDouble();
           scanner.nextLine();
           alunos[i] = new Aluno(nome, nota1, nota2);
       }
        System.out.println("--- Situação dos alunos ---");
       for(int i = 0; i < alunos.length; i++){
           System.out.println("Aluno: " + alunos[i].getNome());
           if(alunos[i].foiAprovado()){
               System.out.println("Situação: Aprovado.\n");
           }else{
               System.out.println("Situação: Reprovado.\n");
           }

       }

       Aluno.maiorMedia(alunos);

       scanner.close();
    }
}
