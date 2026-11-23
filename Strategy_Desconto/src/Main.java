import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        double valorOriginal = 200.00;

        CalculadoraDesconto calculadora = new CalculadoraDesconto(new SemDesconto());
        System.out.printf("Valor original: R$ %.2f%n", valorOriginal);
        System.out.printf("Sem desconto: R$ %.2f%n", calculadora.calcular(valorOriginal));

        calculadora.setEstrategia(new DescontoDezPorCento());
        System.out.printf("Desconto de 10%%: R$ %.2f%n", calculadora.calcular(valorOriginal));

        calculadora.setEstrategia(new DescontoVintePorCento());
        System.out.printf("Desconto de 20%%: R$ %.2f%n", calculadora.calcular(valorOriginal));
    }
}
