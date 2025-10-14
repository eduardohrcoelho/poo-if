package exercicios_fixacao_02.exercicio05.application;

import exercicios_fixacao_02.exercicio05.entities.Lutador;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, categoria;
        int forca;
        char op, op2;

        Lutador [] lutadores = new Lutador[4];

        for(int i = 0; i < lutadores.length; i++){
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            System.out.print("Deseja informar a categoria e força? (s/n) ");
            op = scanner.next().toLowerCase().charAt(0);
            if(op == 's'){
                System.out.print("Informe a categoria: ");
                categoria = scanner.nextLine();
                System.out.print("Informe a força: ");
                forca = scanner.nextInt();
                lutadores[i] = new Lutador(nome, categoria, forca);
            }else{
                lutadores[i] = new Lutador(nome);
            }
        }



        scanner.close();
    }
}
