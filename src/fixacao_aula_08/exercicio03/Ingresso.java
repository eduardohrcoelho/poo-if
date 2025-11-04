package fixacao_aula_08.exercicio03;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void imprimeValor(){
        System.out.print("Valor do ingresso: R$" + getValor());
    }
}
