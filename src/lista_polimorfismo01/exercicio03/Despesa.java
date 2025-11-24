package lista_polimorfismo01.exercicio03;

public class Despesa {
    protected String descricao;
    protected double valor;

    public Despesa(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public double calcularTotal(){
        return this.valor;
    }

    public String toString(){
        return "Descrição: " + this.descricao + "\nValor: R$" + this.valor + "\nTotal: R$" + this.calcularTotal();
    }
}
