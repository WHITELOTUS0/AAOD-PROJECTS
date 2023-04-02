import java.io.Serializable;

public class Student2 implements Serializable {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
