package exercicio_avaliativo;

public abstract class Prova {
    private String aluno;
    private double notaBase; // 0 a 10, lançar exceção IllegalArgument

    public Prova(String aluno, double notaBase){
        this.aluno = aluno;
        setNotaBase(notaBase);
    }

    public Prova(){}

    public String getAluno(){
        return this.aluno;
    }

    public double getNotaBase(){
        return this.notaBase;
    }

    public void setNotaBase(double notaBase){
        if(notaBase < 0 || notaBase > 10){
            throw new IllegalArgumentException("A nota informada deve estar no intervalo de 0 a 10!");
        }
        this.notaBase = notaBase;
    }

    public abstract double corrigir();
}
