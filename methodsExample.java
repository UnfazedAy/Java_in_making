public class methodsExample {
    static class Person {
        public String name(String name) {
            return name;
        }

        public int age(int num) {
            return num;
        }

        public String career(String job) {
            return job;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        String name = person1.name("Ayomide");
        int age = person1.age(24);
        String career = person1.career("Software developer");
        String compile = String.format(
            "Hello my name is %s and I'm %d years old and also a %s.", name, age, career
        );
        System.out.println(compile);
    }
}