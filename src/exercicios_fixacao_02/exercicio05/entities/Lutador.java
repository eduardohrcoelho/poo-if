package exercicios_fixacao_02.exercicio05.entities;

public class Lutador {
    private String nome;
    private String categoria;
    private int forca;

    public Lutador(){}

    public Lutador(String nome, String categoria, int forca){
        this.nome = nome;
        this.categoria = categoria;
        this.forca = forca;
    }

    public Lutador(String nome) {
        this.nome = nome;
        this.categoria = "Livre";
        this.forca = 50;
    }

    public void lutar(Lutador lutador){
        if(this.forca < lutador.forca){
            System.out.println("Vencedor: " + lutador.nome);
        }else{
            System.out.println("Vencedor: " + this.nome);
        }
    }
}
