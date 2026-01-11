package exercicio_avaliativo;

public class ProvaDiscursiva extends Prova{
    private int numeroLinhas;

    public ProvaDiscursiva(String aluno, double notaBase, int numeroLinhas){
        super(aluno, notaBase);
        this.numeroLinhas = numeroLinhas;
    }

    public int getNumeroLinhas(){
        return this.numeroLinhas;
    }


    @Override
    public double corrigir(){
        return 9;
    }
}
