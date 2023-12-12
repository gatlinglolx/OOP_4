package Dog;

import java.util.*;

public class Dog {
    private String name;
    private Date birthDate;

    public Dog(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
