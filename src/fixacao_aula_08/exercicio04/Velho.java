package fixacao_aula_08.exercicio04;

public class Velho extends Imovel{
    private double desconto;

    public Velho(){}

    public Velho(String endereco, double preco, double desconto){
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto(){
        return this.desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    @Override
    public void imprime(){
        System.out.printf("Valor adicional: R$%.2f", getDesconto());
        System.out.printf("Valor total: R$%.2f", (getPreco()- getDesconto()));
    }
}
