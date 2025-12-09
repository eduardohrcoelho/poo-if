package lista_abstrata_interface.exercicio02;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(){
        System.out.println("A moto da " + this.getMarca() + " modelo " + this.getModelo() + " está acelerando");
    }

    @Override
    public void frear(){
        System.out.println("A moto da " + this.getMarca() + " modelo " + this.getModelo() + " está freando");
    }

    public void empinar(){
        System.out.println("Empinando a moto!");
    }
}
