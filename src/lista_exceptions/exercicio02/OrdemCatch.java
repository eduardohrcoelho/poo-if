package lista_exceptions.exercicio02;

import java.util.*;

public class OrdemCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vet[] = {92, 10, 22, 34, 55};

        /*
        Sem tratamento
        System.out.println("Informe o índice que deseja acessar: (0-4)");
        int indice = scanner.nextInt();
        System.out.println("Informe um divisor: ");
        int divisor = scanner.nextInt();
        int divisao = vet[indice]/divisor;
        System.out.println("Resultado: " + divisao);

        ------------------- Exception generica antes das especificas -----------------
        try {
            System.out.println("Informe o índice que deseja acessar: (0-4)");
            int indice = scanner.nextInt();
            System.out.println("Informe um divisor: ");
            int divisor = scanner.nextInt();
            int divisao = vet[indice]/divisor;
            System.out.println("Resultado: " + divisao);
        } catch (Exception e) {
            System.out.println("Erro!");;
        } catch (InputMismatchException e2){
            System.out.println("Erro! Tipo incompatível");
        }  catch (ArithmeticException e3){
            System.out.println("Erro! Divisão por zero");
        } catch (IndexOutOfBoundsException e4){
            System.out.println("Erro! Posição inválida");
        }

        */
        try {
            System.out.println("Informe o índice que deseja acessar: (0-4)");
            int indice = scanner.nextInt();
            System.out.println("Informe um divisor: ");
            int divisor = scanner.nextInt();
            int divisao = vet[indice]/divisor;
            System.out.println("Resultado: " + divisao);
        }  catch (InputMismatchException e2){
            System.out.println("Erro! Tipo incompatível");
        }  catch (ArithmeticException e3){
            System.out.println("Erro! Divisão por zero");
        } catch (IndexOutOfBoundsException e4){
            System.out.println("Erro! Posição inválida");
        } catch (Exception e) {
            System.out.println("Erro!");;
        }
    }
}
