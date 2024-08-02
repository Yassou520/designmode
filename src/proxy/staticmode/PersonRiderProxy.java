package proxy.staticmode;

public class PersonRiderProxy implements Person{
    private Person person;

    public PersonRiderProxy(Person person){
        this.person = person;
    }
    @Override
    public void fight() {
        System.out.println("铠甲组装完成");
        person.fight();
        System.out.println("铠甲合体！");
    }
}
