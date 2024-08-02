package observermode;

public class ObserverA implements Observer{
    private int temp;
    private String name;
    public ObserverA(String name,int temp){
        this.name = name;
        this.temp = temp;
    }
    @Override
    public void update(int tem) {
        this.temp = tem;
        System.out.println(name+"信息更新 最新温度为 "+temp);
    }
}
