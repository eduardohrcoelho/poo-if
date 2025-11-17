package lista_polimorfismo01.exercicio02;

import java.util.*;

public class ControleTransporte {
    static List<Transporte> transportes = new ArrayList<>();

    public static void main(String[] args) {
        transportes.add(new Transporte(10, 5.0));
        transportes.add(new Onibus(20, 5.70, 5));
        transportes.add(new Taxi(4, 4.30, 2.00));

        mostrarTarifas(transportes);
    }

    public static void mostrarTarifas(List <Transporte> lista){
        for(Transporte transporte : lista){
            System.out.println(transporte);
        }
    }
}
