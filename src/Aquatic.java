public class Aquatic {
}

    String family, name;
    int age;


    public Aquatic() {

    }

    public Aquatic(String family, String name, int age) {
        this.family = family;
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
