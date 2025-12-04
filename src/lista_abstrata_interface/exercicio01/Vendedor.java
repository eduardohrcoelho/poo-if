package lista_abstrata_interface.exercicio01;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }


    @Override
    public double calcularSalario(){
        return this.salarioBase + 700.00;
    }
}
