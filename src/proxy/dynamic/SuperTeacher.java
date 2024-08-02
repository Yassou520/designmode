package proxy.dynamic;

public class SuperTeacher implements ITeacher{
    @Override
    public void teach() {
        System.out.println("超级老师授课");
    }
}
