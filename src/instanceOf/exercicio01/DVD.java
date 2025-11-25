package instanceOf.exercicio01;

public class DVD extends ItemBiblioteca{
    private int duracaoMin;

    public DVD(String titulo, int ano, int duracaoMin){
        super(titulo, ano);
        this.duracaoMin = duracaoMin;
    }

    public void assistirTrailer(){
        System.out.println("Iniciando trailer de " + this.titulo);
    }
}
