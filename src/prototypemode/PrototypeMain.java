package prototypemode;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("zhangsan", 18, new Account(1));
        Person person1 = (prototypemode.Person) person.clone();
        Person person2 = (prototypemode.Person) person.clone();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.getAccount().hashCode());
        System.out.println(person2.getAccount().hashCode());
    }
}
