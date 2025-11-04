package fixacao_aula_08.exercicio04;

public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(){}

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void imprime(){
        System.out.printf("Valor do imóvel: R$%.2f", getPreco());
    }
}
