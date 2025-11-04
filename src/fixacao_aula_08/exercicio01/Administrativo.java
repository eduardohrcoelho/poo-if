package fixacao_aula_08.exercicio01;

public class Administrativo extends Assistente{
    private String turno;

    public Administrativo(){}

    public Administrativo(String nome, double salario, int matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    public String getTurno(){
        return this.turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalário: R$" + getSalario() + "\nGanho Anual: R$" + ganhoAnual() +"\nMatrícula: " + getMatricula() + "\nTurno: " + getTurno());
    }

    public double ganhoAnual(){
        if(turno.equalsIgnoreCase("noite")){
            double salarioComAdicional = getSalario() + (getSalario() * 0.1);
            return salarioComAdicional * 12;
        }
        return super.ganhoAnual();

    }
}
