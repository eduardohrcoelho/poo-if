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
            throw new IllegalArgumentException("Erro ao cadastrar! O número de erros não pode ser negativo");
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
        int  totalDesconto = this.erros/2;

        if(totalDesconto > 0){
            notaFinal -= (0.5*totalDesconto);
        }

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

    public String toString(){
        return "Aluno: " + this.getAluno() + "\nNota inicial: " + this.getNotaBase()+ "\nNota Final: " + corrigir() + "\nErros: " + this.getErros() + "\n";
    }
}
