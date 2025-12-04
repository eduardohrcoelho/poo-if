package lista_abstrata_interface.exercicio01;

public class SistemaSeguranca implements Autenticavel{
    @Override
    public boolean autenticar() {
        System.out.println("Autenticando sistema XPTO...");
        return true;
    }
}
