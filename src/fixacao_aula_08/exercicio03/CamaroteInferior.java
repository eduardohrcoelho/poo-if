package fixacao_aula_08.exercicio03;

public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(double valorBase, double valorAdicional, String localizacao) {
        super(valorBase, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void imprimeLocalizacao(){
        System.out.println("Localização: " + getLocalizacao());
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do Camarote Inferior: R$ " + getValorTotal());
        imprimeLocalizacao();
    }
}
