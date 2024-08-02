package decoratormode;

public class Sugar extends Decorator{
    public Sugar(DrinkComponent drinkComponent) {
        super(drinkComponent);
        setCost(1.0);
        setDesc("白糖");
    }
}
