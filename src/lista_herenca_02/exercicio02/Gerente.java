package lista_herenca_02.exercicio02;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " Bônus: R$" + String.format("%.2f", this.bonus);
    }
}
