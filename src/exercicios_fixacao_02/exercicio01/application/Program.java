package exercicios_fixacao_02.exercicio01.application;

import exercicios_fixacao_02.exercicio01.entities.Filme;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char op;
        String titulo, genero;
        double duracao;

        Filme filmes [] = new Filme[5];

        for(int i = 0; i < filmes.length; i++){
            System.out.print("Informe o título do " + (i+1) + "º filme: ");
            titulo = scanner.nextLine();
            System.out.print("Informe o gênero do filme: ");
            genero = scanner.nextLine();
            System.out.print("Deseja informar a duração do filme (s/n)?");
            op = scanner.next().toLowerCase().charAt(0);
            if(op == 's'){
                System.out.print("Informe a duração do filme: ");
                duracao = scanner.nextDouble();
                filmes[i] = new Filme(titulo, genero, duracao);
            }else{
                filmes[i] = new Filme(titulo, genero);
            }
            scanner.nextLine();
        }

        Filme.maisLongo(filmes);
        Filme.calculaMedia(filmes);

        scanner.close();
    }
}
