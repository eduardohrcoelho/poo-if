package instanceOf.exercicio02;

public class CartaoCredito extends Pagamento{
    private String numCartao;

    public CartaoCredito(double valor, String numCartao){
        super(valor);
        this.numCartao = numCartao;
    }

    public void verificarLimite(){
        System.out.println("Verificando limite disponível...");
    }

    @Override
    public void processar(){
        System.out.println("Pagamento de R$" + this.valor + "no cartão: " + this.numCartao);
    }
}
