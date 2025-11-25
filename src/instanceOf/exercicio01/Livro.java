package instanceOf.exercicio01;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, int ano, String autor){
        super(titulo, ano);
        this.autor = autor;
    }

    public void lerSinopse(){
        System.out.println("Lendo sinopse de " + this.titulo);
    }
}
