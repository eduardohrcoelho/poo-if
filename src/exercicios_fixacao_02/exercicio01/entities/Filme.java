package exercicios_fixacao_02.exercicio01.entities;

public class Filme {
    private String titulo;
    private String genero;
    private double duracao;
    private static final double DURACAO_PADRAO = 90.0;

    public Filme(){}

    public Filme(String titulo, String genero, double duracao){
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public Filme(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = DURACAO_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public static void maisLongo(Filme [] filmes){
        int indice = 0;
        double maisLongo = 0.0;
        for(int i = 0; i < filmes.length; i++){
            if(filmes[i].getDuracao() > maisLongo){
                indice = i;
                maisLongo = filmes[i].getDuracao();
            }
        }
        System.out.println("Filme mais longo: " + filmes[indice].getTitulo());
    }

    public static void calculaMedia(Filme [] filmes){
        double media = 0.0;
        double soma = 0.0;
        for(int i = 0; i < filmes.length; i++){
            soma += filmes[i].getDuracao();
        }
        media = soma/filmes.length;
        System.out.printf("A média de duração dos filmes é: %.2f", media);
    }
}
