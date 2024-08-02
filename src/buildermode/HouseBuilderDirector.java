package buildermode;

public class HouseBuilderDirector {
    private final AbstractHouseBuilder houseBuilder;
    public HouseBuilderDirector(AbstractHouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House buildHouse(){
        System.out.println("房屋开始构建=======");
        Object o = new Object();

        houseBuilder.basicBuild();
        houseBuilder.midBuild();
        houseBuilder.topBuild();
        
        System.out.println("房屋构建完成=======");
        return houseBuilder.getHouse();
    }
}
