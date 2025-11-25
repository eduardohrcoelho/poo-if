package instanceOf.exercicio02;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public void processar(){
        System.out.println("Processando pagamento genérico de R$" + this.valor);
    }
}
