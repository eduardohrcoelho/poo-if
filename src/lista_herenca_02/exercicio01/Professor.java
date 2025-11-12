package lista_herenca_02.exercicio01;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void falar() {
        System.out.println(this.nome + ", professor(a) de " + this.disciplina + ", está explicando o conteúdo.");
    }

}
