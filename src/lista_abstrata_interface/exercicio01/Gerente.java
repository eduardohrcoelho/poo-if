package lista_abstrata_interface.exercicio01;

public class Gerente extends Funcionario implements Autenticavel{
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public boolean autenticar() {
        return false;
    }

    @Override
    public double calcularSalario(){
        return this.salarioBase + 2000.00;
    }
}
