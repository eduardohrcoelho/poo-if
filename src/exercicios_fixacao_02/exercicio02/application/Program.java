package exercicios_fixacao_02.exercicio02.application;

import exercicios_fixacao_02.exercicio02.entities.Carro;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String modelo;
        double velMaxima = 0.0;

        Carro carros [] = new Carro[3];

        System.out.println("--- Informe o modelo e velocidade máxima dos carros ---");
        for(int i = 0; i < carros.length; i++){
            System.out.print("Modelo: ");
            modelo = scanner.nextLine();
            System.out.print("Velocidade máxima: ");
            velMaxima = scanner.nextDouble();
            carros[i] = new Carro(modelo, velMaxima);
            scanner.nextLine();
        }

        for(int i = 0; i < carros.length; i++){
            carros[i].acelerar(random.nextDouble(280));
        }

        for(int i = 0; i < carros.length; i++){
            System.out.println(carros[i].getVelAtual());;
        }
        scanner.close();
    }
}
