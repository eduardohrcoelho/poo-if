package instanceOf.exercicio01;

import java.util.*;

public class Estante {
    public static void main(String[] args) {
        List<ItemBiblioteca> itens = new ArrayList<>();

        itens.add(new Livro("Comunidades", 2022, "Tarcizio Silva"));
        itens.add(new DVD("Titanic", 1979, 120));

        for(ItemBiblioteca i : itens){
            if(i instanceof Livro){
                ((Livro) i).lerSinopse();
            }else if(i instanceof DVD){
                ((DVD) i).assistirTrailer();
            }
        }
    }
}
