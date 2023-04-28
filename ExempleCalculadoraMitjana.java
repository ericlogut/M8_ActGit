import java.util.ArrayList;
import java.util.List;

public class ExempleCalculadoraMitjana {

    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<Double>();
        numeros.add(10.0);
        numeros.add(20.0);
        numeros.add(30.0);
        numeros.add(40.0);
        numeros.add(50.0);

        CalculadoraMitjana calculadora = new CalculadoraMitjana();
        double mitjana = calculadora.calcularMitjana(numeros);

        System.out.println("La mitjana dels nombres és " + mitjana);
    }

}
