package lista_herenca_02.exercicio01;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void falar() {
        super.falar();
        System.out.println(this.nome + ", aluno do curso de " + this.curso + ", está apresentando um trabalho.");
    }
}

