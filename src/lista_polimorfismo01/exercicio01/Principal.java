package lista_polimorfismo01.exercicio01;

import static lista_polimorfismo01.exercicio01.ConversorTemperatura.converter;

public class Principal {
    public static void main(String[] args) {
        double fh = converter(27);
        System.out.println(fh);
        fh = converter(32, "f");
        System.out.println(fh);
        fh = converter(0, "k");
        System.out.println(fh);
        fh = converter(32, "o");
        System.out.println(fh);
        fh = converter(100, "f", "k");
        System.out.printf("%.2f", fh);
        System.out.println();
        fh = converter(30, "k", "f");
        System.out.printf("%.2f", fh);
    }
}
