package decoratormode;

public class Ice  extends Decorator{
    public Ice(DrinkComponent drinkComponent) {
        super(drinkComponent);
        setCost(1.5);
        setDesc("冰块");
    }
}
