package fixacao_aula_08.exercicio01;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(){}

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor){
        if(valor <= 0.0){
            System.out.println("Valor inválido! Aumento deve ser um valor positivo maior que zero.");
        }
        this.salario += valor;
    }

    public double ganhoAnual(){
        return this.salario*12;
    }

    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalário: R$" + getSalario() + "Ganho Anual: R$" + ganhoAnual());
    }

}
