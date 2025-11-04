package fixacao_aula_08.exercicio04;

public class Novo extends Imovel{
    private double adicional;

    public Novo(){}

    public Novo(String nome, double preco, double adicional){
        super(nome, preco);
        this.adicional = adicional;
    }

    public double getAdicional(){
        return adicional;
    }

    public void setAdicional(double adicional){
        this.adicional = adicional;
    }

    @Override
    public void imprime(){
        System.out.printf("Valor adicional: R$%.2f", getAdicional());
        System.out.printf("Valor total: R$%.2f", (getPreco()+getAdicional()));
    }
}
