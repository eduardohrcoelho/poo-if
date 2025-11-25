package instanceOf.exercicio02;

import java.util.*;

public class SistemaPagamentos {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new Pix(100.00, "1434275"));
        pagamentos.add(new CartaoCredito(1000, "1029304"));

        for(Pagamento pagamento : pagamentos){
            pagamento.processar();
            if(pagamento instanceof Pix){
                Pix p = (Pix) pagamento;
                p.enviarComprovante();
            }else if(pagamento instanceof CartaoCredito){
                CartaoCredito c = (CartaoCredito) pagamento;
                c.verificarLimite();
            }
        }
    }
}
