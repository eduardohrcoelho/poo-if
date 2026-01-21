package exercicio_aval_revisao;

public abstract class Prova {
    private String aluno;
    private double notaBase;

    public Prova(String aluno, double notaBase){
        this.aluno = aluno;
        setNotaBase(notaBase);
    }

    public void setNotaBase(double notaBase){
        if(notaBase < 0 || notaBase > 10){
            throw new IllegalArgumentException("Valor de nota inválido");
        }
        this.notaBase = notaBase;
    }

    public String getAluno(){
        return this.aluno;
    }

    public double getNotaBase(){
        return this.notaBase;
    }

    public abstract double corrigir();
}
