package fixacao_aula_08.exercicio01;

public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(){}

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial){
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial(){
        return this.bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalário: R$" + getSalario() + "\nGanho Anual: R$" + ganhoAnual() + "\nMatrícula: " + getMatricula() + "\nBônus Salarial: " + getBonusSalarial());
    }


    public double ganhoAnual(){
        return (getSalario() * 12) + this.bonusSalarial;
    }
}
