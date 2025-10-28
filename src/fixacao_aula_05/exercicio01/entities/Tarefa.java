package fixacao_aula_05.exercicio01.entities;

public class Tarefa {
    private String descricao;
    private int prioridade;
    private String status;

    public Tarefa(){
        this.descricao = "Sem descrição";
        this.prioridade = 3;
        this.status = "Não concluída";
    }

    public Tarefa(String descricao, int prioridade, String status) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override

    public String toString(){
        return "Descrição: " + getDescricao() + "\nPrioridade: " + getPrioridade() + "\nStatus: " + getStatus() + "\n";
    }
}
