package lista_herenca_02.exercicio03;

import java.util.Objects;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + " | Preço: R$" + String.format("%.2f", this.preco); // [cite: 28]
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Produto other = (Produto) obj;

        return Double.compare(this.preco, other.preco) == 0 && Objects.equals(this.nome, other.nome);
    }
}
