package exercicio_aval_revisao;

public class ProvaObjetiva extends Prova implements Avaliavel{
    private int erros;

    public ProvaObjetiva(String aluno, double notaBase, int erros){
        super(aluno, notaBase);
        setErros(erros);
    }

    public void setErros(int erros){
        if(erros < 0){
            throw new IllegalArgumentException("O número de erros não pode ser negativo.");
        }
        this.erros = erros;
    }

    @Override
    public double corrigir(){
        double notaFinal = getNotaBase();
        int totalErros = this.erros/2;
        notaFinal -= (totalErros*0.5);

        if(podeReceberBonus()){
            notaFinal += 0.5;
        }

        if(notaFinal < 0){
            notaFinal = 0.0;
        }
        if(notaFinal > 10){
            notaFinal = 10.0;
        }

        return notaFinal;
    }

    @Override
    public boolean podeReceberBonus(){
        return true;
    }
}
