package buildermode;

public class BuilderClient {
    public static void main(String[] args) {
        AbstractHouseBuilder houseBuilder = new SuperHouseBuilder();
        HouseBuilderDirector houseBuilderDirector = new HouseBuilderDirector(houseBuilder);
        House house = houseBuilderDirector.buildHouse();
        System.out.println(house);
        
    }
}
