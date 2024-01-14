class Human {
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

public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setName("Ayomide");
        obj1.setAge(24);
        System.out.printf("My name is %s and I'm %d years old", obj1.getName(), obj1.getAge());
    }
}