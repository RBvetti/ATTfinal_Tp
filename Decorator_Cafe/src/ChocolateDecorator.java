public class ChocolateDecorator extends CafeDecorator {
    public ChocolateDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + " e chocolate";
    }

    @Override
    public double getPreco() {
        return cafeDecorado.getPreco() + 3.00;
    }
}
