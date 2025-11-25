package instanceOf.exercicio02;

public class Pix extends Pagamento{
    private String chavePix;

    public Pix(double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }

    public void enviarComprovante(){
        System.out.println("Enviando comprovante para o e-mail do cliente...");
    }

    @Override
    public void processar(){
        System.out.println("Pagamento via pix de R$" + this.valor + " para a chave: " + this.chavePix);
    }
}
