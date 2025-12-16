package lista_exceptions.exercicio07;

public class Principal {
    public static void main(String[] args) {
        double saldo = 0;
        try{
            saldo = sacar(900);
            System.out.println(saldo);
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    public static double sacar(double valor) throws SaldoInsuficienteException{
        double saldo = 1000;
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }else{
            return saldo -= valor;
        }
    }
}
