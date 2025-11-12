package lista_herenca_02.exercicio01;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void falar() {
        System.out.println(this.nome + " está falando."); // [cite: 4]
    }
}
