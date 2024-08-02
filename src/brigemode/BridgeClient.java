package brigemode;

public class BridgeClient {
    public static void main(String[] args) {
        Phone phone = new UpRightPhone(new Mi());
        phone.call();
    }

}
