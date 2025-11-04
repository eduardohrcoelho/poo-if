package fixacao_aula_08.exercicio03;

public class Normal extends Ingresso{
    public Normal(double valor){
        super(valor);
    }

    public void imprimeTipo(){
        System.out.print("Ingresso Normal");
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso VIP: R$ " + getValor());
    }
}
