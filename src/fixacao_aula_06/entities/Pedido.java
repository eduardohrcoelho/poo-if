package fixacao_aula_06.entities;

import java.util.List;

public class Pedido {
    private String nome;
    private int id;
    private double valor;
    private String status;

    public Pedido(){}

    public Pedido(String nome, int id, double valor, String status) {
        this.nome = nome;
        setId(id);
        setValor(valor);
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0){
            System.out.println("Erro! ID inválido!");
        }
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor < 0){
            System.out.println("Erro! Valor não pode ser negativo");
        }
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override

    public String toString(){
        return "Nome: " + getNome() + "\nId: " + getId() + "\nValor: " + getValor() + "\nStatus: " + getStatus() + "\n";
    }
}
