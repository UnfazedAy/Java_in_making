class Person {
    // Using a default constructor
    public Person() {
        age = 12;
        name = "John";
    }

    // Using a parametrized constructor
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person(16, "Jonas");
        Person obj3 = new Person(12, "unknown");
        obj3.setName("UnfazedAy");
        obj3.setAge(24);
        System.out.printf("My name is %s and I'm %d years old\n", obj1.getName(), obj1.getAge());
        System.out.printf("My name is %s and I'm %d years old\n", obj2.getName(), obj2.getAge());
        System.out.printf("My name is %s and I'm %d years old", obj3.getName(), obj3.getAge());
    }
}