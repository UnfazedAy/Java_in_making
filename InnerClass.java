class AllFruits {
    public void show() {
        System.out.println("In AllFruits show");
    }
    class B {
        public void config() {
            System.out.println("In B Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        AllFruits obj = new AllFruits();
        obj.show();

        // B is an InnerClass hence can only be reference with an obj of AllFruits here
        AllFruits.B obj1 = obj.new B();
        obj1.config();
    }
}