package exercicio_avaliativo;

public abstract class Prova {
    private String aluno;
    private double notaBase; // 0 a 10, lançar exceção IllegalArgument

    public Prova(String aluno, double notaBase){
        this.aluno = aluno;
        this.notaBase = notaBase;
    }

    public Prova(){}

    public String getAluno(){
        return this.aluno;
    }

    public double getNotaBase(){
        return this.notaBase;
    }

    public abstract double corrigir();
}
