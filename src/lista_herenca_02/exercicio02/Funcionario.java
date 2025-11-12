package lista_herenca_02.exercicio02;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.nome + " | Salário: R$" + String.format("%.2f", this.salario);
    }
}
