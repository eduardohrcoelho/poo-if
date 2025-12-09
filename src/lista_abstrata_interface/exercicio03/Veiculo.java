package lista_abstrata_interface.exercicio03;

abstract class Veiculo {
    protected String marca;
    public Veiculo(String marca) {
        this.marca = marca;
    }
    public abstract double calcularTarifa(int horas);
}
interface VeiculoMotorizado {
    void ligarMotor();
}
class Carro extends Veiculo implements VeiculoMotorizado {
    private String modelo;
    public Carro(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }
    @Override
    public void ligarMotor() {
        System.out.println("O motor do carro foi ligado.");
    }
    @Override
    public double calcularTarifa(int horas) {
        return horas * 10.0;
    }
}
class Moto extends Veiculo implements VeiculoMotorizado {
    private String modelo;
    public Moto(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }
    @Override
    public void ligarMotor() {
        System.out.println("O motor da moto foi ligado.");
    }
    @Override
    public double calcularTarifa(int horas) {
        return horas * 10.0;
    }
}
class Bicicleta extends Veiculo {
    private String tipo;
    public Bicicleta(String marca, String tipo) {
        super(marca);
        this.tipo = tipo;
    }
    @Override
    public double calcularTarifa(int horas) {
        return horas * 5.0;
    }
}
class Estacionamento {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Carro("Toyota", "Corolla");
        veiculos[1] = new Moto("Yamaha", "Fazer");
        veiculos[2] = new Bicicleta("Caloi", "Mountain Bike");
        for (Veiculo v : veiculos) {
            System.out.println("Marca: " + v.marca + ", Tarifa: R$" + v.calcularTarifa(3));
            if (v instanceof VeiculoMotorizado) {
                ((VeiculoMotorizado) v).ligarMotor();
            }
        }
    }
}