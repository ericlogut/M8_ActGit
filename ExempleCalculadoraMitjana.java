import java.util.ArrayList;
import java.util.List;

public class ExempleCalculadoraMitjana {

    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<Double>();
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(4.0);
        numeros.add(5.0);

        CalculadoraMitjana calculadora = new CalculadoraMitjana();
        double mitjana = calculadora.calcularMitjana(numeros);

        System.out.println("La mitjana és " + mitjana);
    }

}
