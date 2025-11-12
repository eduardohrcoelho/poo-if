package lista_herenca_02.exercicio01;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", 20, "Sistemas de Informação");
        Professor prof = new Professor("Ana", 35, "Programação Orientada a Objetos");
        aluno.falar();
        prof.falar();
    }
}
