package buildermode;

public class SuperHouseBuilder extends AbstractHouseBuilder{
    @Override
    public void basicBuild() {
        getHouse().setName("高级");
        System.out.println("高级房构建");
    }

    @Override
    public void midBuild() {
        System.out.println("高级房中层构建");
    }

    @Override
    public void topBuild() {
        getHouse().setHeight(60);
        System.out.println("高级房房顶构建");
    }
}
