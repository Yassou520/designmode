package proxy.staticmode;

public class StaticProxyClient {
    public static void main(String[] args) {
        Person person = new NormalPerson();
        Person personRider = new PersonRiderProxy(person);
        personRider.fight();
    }
}
