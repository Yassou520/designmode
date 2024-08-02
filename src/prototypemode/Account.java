package prototypemode;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;

    public Account(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
