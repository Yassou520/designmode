package decoratormode;

public abstract class DrinkComponent {
    private String desc;
    private double cost;

    protected DrinkComponent(){
        desc = "";
        cost = 0;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public abstract double cost();
}
