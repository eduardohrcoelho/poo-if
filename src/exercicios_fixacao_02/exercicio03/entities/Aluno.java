package exercicios_fixacao_02.exercicio03.entities;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(){}

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2)/2;
    }

    public boolean foiAprovado(){
        if(calcularMedia() >= 60){
            return true;
        }
        return false;
    }

    public static void maiorMedia(Aluno [] alunos){
        double maior = 0.0;
        int indice = 0;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].calcularMedia() > maior){
                indice = i;
                maior = alunos[i].calcularMedia();
            }
        }

        System.out.println("Aluno com maior média: " + alunos[indice].nome);
    }
}
