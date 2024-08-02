package decoratormode;

public class DecoratorClient {
    public static void main(String[] args) {
        DrinkComponent blackCoffee = new BlackCoffee();
        blackCoffee = new Sugar(blackCoffee);
        blackCoffee = new Sugar(blackCoffee);
        System.out.println("描述："+blackCoffee.getDesc());
        System.out.println("价格："+blackCoffee.cost());
        DrinkComponent espresso = new Espresso();
        espresso = new Ice(new Sugar(espresso));
        System.out.println("描述："+espresso.getDesc());
        System.out.println("价格："+espresso.cost());
    }
}
