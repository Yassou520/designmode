package decoratormode;

public class Coffee extends DrinkComponent {
    @Override
    public double cost() {
        return getCost();
    }
}
