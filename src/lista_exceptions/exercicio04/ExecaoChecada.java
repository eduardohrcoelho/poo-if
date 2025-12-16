package lista_exceptions.exercicio04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExecaoChecada {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("dados.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");;
        } catch(IOException e2){
            System.out.println("Falha ao ler o arquivo");
        }
    }
}
/*
Resposta:
A diferença entre FileNotFoundException e IOException é a hierarquia, visto que IOException é mais genérica e abrange FileNotFoundException. Sendo assim,
ao colocar IOException primeiro ela pega o erro de arquivo não encontrado também
 */