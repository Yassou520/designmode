package buildermode;

public class CommonBuilder extends AbstractHouseBuilder{
    @Override
    public void basicBuild() {
        getHouse().setName("普通房子");
        System.out.println("普通房构建基础");
    }

    @Override
    public void midBuild() {
        System.out.println("普通房中间构建");
    }

    @Override
    public void topBuild() {
        getHouse().setHeight(10);
        System.out.println("普通房顶构建");
    }
}
