package exercicio_avaliativo;

public class ProvaObjetiva extends Prova implements Avaliavel{
    private int erros; // Não pode ser negativo

    public ProvaObjetiva(String aluno, double notaBase, int erros){
        super(aluno, notaBase);
        setErros(erros);
    }

    public int getErros(){
        return this.erros;
    }

    public void setErros(int erros){
        if(erros < 0){
            throw new IllegalArgumentException();
        }

        this.erros = erros;
    }

    @Override
    public boolean podeReceberBonus() {
        if(this.erros <= 2){
            return true;
        }
        return false;
    }

    public double corrigir(){
        double notaFinal = this.getNotaBase();
        int numeroErros = 0, totalErros = 0;

        for(int i = 0; i < this.getErros(); i++){
            numeroErros++;
            if(numeroErros == 2){
                totalErros++;
                numeroErros = 0;
            }
        }

        if(totalErros > 0){
            notaFinal -= (0.5*totalErros);
        }

        if(podeReceberBonus()){
            notaFinal += 0.5;
        }


        return notaFinal;
    }

    public String toString(){
        return "Aluno: " + this.getAluno() + "\nNota Final: " + corrigir() + "\nErros: " + this.getErros() + "\n";
    }
}
