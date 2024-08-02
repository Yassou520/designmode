package sharemetamode;

public class ConcreteWebsite implements Website{

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
     public ConcreteWebsite(String type){
         this.type = type;
     }
    @Override
    public void use(User user) {
        System.out.println(type+"网站正在使用"+"  使用者:"+user.getName());
    }
}
