package exercicios_fixacao_01.exercicio02.application;

import exercicios_fixacao_01.exercicio02.entities.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Aluno> list = new ArrayList<>();

        double [] notas = new double[2];
        System.out.println("Quantos alunos deseja inserir? ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            scanner.nextLine();
            System.out.println("Informe o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.println("Informe a matricula: ");
            int matricula = scanner.nextInt();
            System.out.println("Informe a primeira nota: ");
            notas[0] = scanner.nextDouble();
            System.out.println("Informe a segunda nota: ");
            notas[1] = scanner.nextDouble();
            list.add(new Aluno(nome, matricula, notas));
        }

        for(Aluno aluno : list){
            aluno.mostrarDados();
        }

        list.remove(2);
        System.out.println("=================");
        for(Aluno aluno : list){
            aluno.mostrarDados();
        }
        scanner.close();
    }
}
