package decoratormode;


public abstract class Decorator extends DrinkComponent{
    private DrinkComponent drinkComponent;

    public Decorator(DrinkComponent drinkComponent){
        this.drinkComponent = drinkComponent;
    }
    @Override
    public double cost(){
        return super.getCost() + drinkComponent.cost();
    }
    @Override
    public String getDesc(){
        return drinkComponent.getDesc()+" "+drinkComponent.getCost()+" 元"+super.getDesc()+" "+super.getCost()+" 元";
    }
}
