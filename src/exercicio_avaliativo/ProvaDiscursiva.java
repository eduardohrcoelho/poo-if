package exercicio_avaliativo;

public class ProvaDiscursiva extends Prova{
    private int numeroLinhas; // Tem que ser maior que zero

    public ProvaDiscursiva(String aluno, double notaBase, int numeroLinhas){
        super(aluno, notaBase);
        setNumeroLinhas(numeroLinhas);
    }

    public int getNumeroLinhas(){
        return this.numeroLinhas;
    }

    public void setNumeroLinhas(int numeroLinhas){
        if(numeroLinhas <= 0){
            throw new IllegalArgumentException("O número de linhas deve ser maior que zero");
        }
        this.numeroLinhas = numeroLinhas;
    }


    @Override
    public double corrigir(){
        double notaFinal = this.getNotaBase();
        if(this.getNumeroLinhas() < 10){
            notaFinal -= 2.0;
        }else if(this.getNumeroLinhas() > 30){
            notaFinal -= 1.0;
        }

        if(notaFinal < 0){
            notaFinal = 0.0;
        }

        if(notaFinal > 10){
            notaFinal = 10.0;
        }

        return notaFinal;
    }

    public String toString(){
        return "Aluno: " + this.getAluno() + "\nNota Final: " + corrigir() + "\nNúmero de linhas: " + this.getNumeroLinhas() + "\n";
    }
}
