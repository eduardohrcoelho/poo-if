package lista_exceptions.exercicio06;

public class Throw {
    public static void validarIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }else{
            System.out.println("Idade válida");
        }
    }

    public static void main(String[] args) {
        try{
            validarIdade(-10);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
