package lista_exceptions.exercicio01;
import java.util.*;
public class DivisaoUnchecked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Sem tratamento:
        System.out.print("Informe um número: ");
        int a = scanner.nextInt();
        System.out.print("Informe outro número: ");
        int b = scanner.nextInt();
        int divisao = a/b;
        System.out.println("Resultado da divisão: " + divisao);
        */

        try {
            System.out.print("Informe um número: ");
            int a = scanner.nextInt();
            System.out.print("Informe outro número: ");
            int b = scanner.nextInt();
            int divisao = a / b;
            System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro! Não é possível realizar divisão por zero");
        } catch(InputMismatchException e2){
            System.out.println("Erro! Tipo incompatível");
        }
    }
}
