package lista_exceptions.exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        try{
            int i = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Erro! Tipo incompatível");
        }finally {
            System.out.println("Encerrando o programa.");
        }
    }
}
