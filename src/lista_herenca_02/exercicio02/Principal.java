package lista_herenca_02.exercicio02;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marcos", 3500.00);
        Gerente gerente = new Gerente("Lucia", 7000.00, 1500.00);

        System.out.println(funcionario);
        System.out.println(gerente);
    }
}
