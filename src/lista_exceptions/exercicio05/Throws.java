package lista_exceptions.exercicio05;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void carregarArquivo(String nome) throws FileNotFoundException{
        FileReader fileReader = null;
        fileReader = new FileReader(nome);
    }

    public static void main(String[] args) {
        String arquivo = "arquivo.txt";

        // carregarArquivo(arquivo);

        try{
            carregarArquivo(arquivo);
        }catch(FileNotFoundException e){
            System.out.println("Erro! Arquivo não encontrado");
        }
    }
}
