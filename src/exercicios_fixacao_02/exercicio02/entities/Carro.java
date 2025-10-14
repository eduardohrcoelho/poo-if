package exercicios_fixacao_02.exercicio02.entities;

public class Carro {
    private String modelo;
    private double velMaxima;
    private double velAtual;

    public Carro(){}

    public Carro(String modelo, double velMaxima) {
        this.modelo = modelo;
        this.velMaxima = velMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public double getVelAtual() {
        return velAtual;
    }

    public void acelerar(double velocidade){
        if((this.velAtual += velocidade) > velMaxima){
            System.out.println("Velocidade ultrapassa o limite!");
        }else{
            this.velAtual += velocidade;
        }

    }

    public void desacelera(double diminui){
        if((this.velAtual -= diminui) < 0){
            System.out.println("Velocidade negativa!");
        }
        this.velAtual -= diminui;
    }


}
