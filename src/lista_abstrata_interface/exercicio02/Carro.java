package lista_abstrata_interface.exercicio02;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(){
        System.out.println("O carro da " + this.getMarca() + " modelo " + this.getModelo() + " está acelerando");
    }

    @Override
    public void frear(){
        System.out.println("O carro da " + this.getMarca() + " modelo " + this.getModelo() + " está freando");
    }

    public void abrirPorta(){
        System.out.println("Abrindo as portas do carro.");
    }
}
