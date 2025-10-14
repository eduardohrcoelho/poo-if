package exercicios_fixacao_01.exercicio02.entities;

public class Aluno {
    public String nome;
    private int matricula;
    private double [] notas;

    public Aluno(){
    }

    public Aluno(String nome, int matricula, double [] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calculaMedia(){
        return (this.notas[0] + this.notas[1])/2;
//        System.out.println("A média é " + media);
    }

    public void mostrarDados(){
        System.out.println("Aluno: " + getNome() + "\nMatrícula: " + getMatricula() + "\nMédia: " + calculaMedia() + "\n");
    }
}
