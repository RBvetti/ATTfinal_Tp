import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        Cafe cafe1 = new CafeSimples();
        System.out.printf("%s: R$ %.2f%n", cafe1.getDescricao(), cafe1.getPreco());

        Cafe cafe2 = new LeiteDecorator(new CafeSimples());
        System.out.printf("%s: R$ %.2f%n", cafe2.getDescricao(), cafe2.getPreco());

        Cafe cafe3 = new ChocolateDecorator(new LeiteDecorator(new CafeSimples()));
        System.out.printf("%s: R$ %.2f%n", cafe3.getDescricao(), cafe3.getPreco());
    }
}
