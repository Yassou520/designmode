package buildermode;

public class House {
    private String name;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
