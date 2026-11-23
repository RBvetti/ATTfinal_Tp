public class LeiteDecorator extends CafeDecorator {
    public LeiteDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + " com leite";
    }

    @Override
    public double getPreco() {
        return cafeDecorado.getPreco() + 2.00;
    }
}
