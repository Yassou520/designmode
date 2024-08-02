package buildermode;

public abstract class AbstractHouseBuilder {
    public House getHouse() {
        return house;
    }

    private House house = new House();

    public abstract void basicBuild();

    public abstract void midBuild();

    public abstract void topBuild();
}
