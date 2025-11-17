package lista_polimorfismo01.exercicio01;

public class ConversorTemperatura {

    public static double converter(double celsius){
        return ((celsius * 1.8)+32);
    }

    public static double converter(double valor, String escala){
        if(escala.equalsIgnoreCase("c")){
            return converter(valor);
        } else if (escala.equalsIgnoreCase("f")){
            return((valor - 32)* 5/9);
        }else if(escala.equalsIgnoreCase("k")){
            return(valor + 273.15);
        }
        System.out.println("Escala inválida. Resultado = 0");
        return 0;
    }

    public static double converter(double valor, String escalaOrigem, String escalaDestino){
        double valorCelsius = 0;
        if(escalaOrigem.equalsIgnoreCase("f") && escalaDestino.equalsIgnoreCase("c")){
            return converter(valor, escalaOrigem);
        }else if(escalaOrigem.equalsIgnoreCase("f") && escalaDestino.equalsIgnoreCase("k")){
            valorCelsius = converter(valor, "f");
            return converter(valorCelsius, "k");
        }else if(escalaOrigem.equalsIgnoreCase("k") && escalaDestino.equalsIgnoreCase("f")){
            return (((valor - 273.15)*(9.0/5.0))+32);
        }else if(escalaOrigem.equalsIgnoreCase("k") && escalaDestino.equalsIgnoreCase("c")){
            return valor - 273.15;
        }else if(escalaOrigem.equalsIgnoreCase("c") && escalaDestino.equalsIgnoreCase("f")){
            converter(valor);
        }else if(escalaOrigem.equalsIgnoreCase("c") && escalaDestino.equalsIgnoreCase("k")){
            converter(valor, escalaDestino);
        }

        return 0;
    }
}
