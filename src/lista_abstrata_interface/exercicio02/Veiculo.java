package lista_abstrata_interface.exercicio02;

public abstract class Veiculo implements Movivel{
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
}
