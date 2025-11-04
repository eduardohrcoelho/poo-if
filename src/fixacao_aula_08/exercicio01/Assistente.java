package fixacao_aula_08.exercicio01;

public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(){}

    public Assistente(String nome, double salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalário: R$" + getSalario() + "\nGanho Anual: R$" + ganhoAnual() + "\nMatrícula: " + getMatricula());
    }

}
