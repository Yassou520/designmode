package sigletonmode;

import java.util.Calendar;

public class Singleton3 {

    private Singleton3() {
    }

    private static class Singleton3Instance {
        public static final Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Singleton3Instance.instance;
    }

}
