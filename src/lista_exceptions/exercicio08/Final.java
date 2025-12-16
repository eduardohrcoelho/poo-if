package lista_exceptions.exercicio08;

import lista_exceptions.exercicio07.SaldoInsuficienteException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Final {
    public static void menu(){
        System.out.println("1 - Ler um número " +
                "\n2 - Realizar divisão " +
                "\n3 - Procurar arquivo" +
                "\n4 - Realizar saque"+
                "\n5 - Sair");
    }

    public static double sacar(double valor) throws lista_exceptions.exercicio07.SaldoInsuficienteException {
        double saldo = 1000;
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }else{
            return saldo -= valor;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        do{
            try {
                menu();
                op = scanner.nextInt();
                scanner.nextLine();
                switch (op){
                    case 1:
                        try {
                            System.out.println("Informe um número: ");
                            int n = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Erro! Tipo invalido");
                            scanner.nextLine();
                        }catch (Exception e2){
                            System.out.println("Erro!");
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("Informe o numerador: ");
                            int a = scanner.nextInt();
                            System.out.println("Informe o denominador: ");
                            int b = scanner.nextInt();
                            int divisao = a/b;
                        } catch (InputMismatchException e) {
                            System.out.println("Erro! Tipo invalido");
                            scanner.nextLine();
                        }catch (ArithmeticException e2){
                            System.out.println("Erro! Divisão por zero");
                            scanner.nextLine();
                        }catch (Exception e3){
                            System.out.println("Erro!");
                            scanner.nextLine();
                        }
                        break;

                    case 3:
                        System.out.println("Informe o caminho do arquivo: ex.txt");
                        String arquivo = scanner.nextLine();
                        FileReader fr = null;
                        try {
                            fr = new FileReader(arquivo);
                            fr.close();
                        } catch (FileNotFoundException e) {
                            System.out.println("Erro! Arquivo não encontrado");
                            scanner.nextLine();
                        } catch (IOException e2){
                            System.out.println("Erro! Erro na leitura do arquivo");
                        } catch (Exception e3){
                            System.out.println("Erro!");
                        }
                        break;

                    case 4:
                        try {
                            System.out.println("Informe o valor para sacar: ");
                            double valor = scanner.nextDouble();
                            sacar(valor);
                        } catch (SaldoInsuficienteException e) {
                            System.out.println(e.getMessage());
                            scanner.nextLine();
                        } catch(InputMismatchException e2){
                            System.out.println("Erro! Tipo invalido");
                        } catch(Exception e3){
                            System.out.println("Erro!");
                        }
                }
            } catch (Exception e) {
                System.out.println("Erro!");
            }finally {
                System.out.println("Operação realizada!");
            }
        }while(op != 5);

    }

}
