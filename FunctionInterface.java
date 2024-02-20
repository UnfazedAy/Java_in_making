@FunctionalInterface
interface C {
    void show();
}

class D implements C {
    public void show() {
        System.out.println("In Show");
    }
}

public class FunctionInterface {
    public static void main(String[] args) {
        C obj = new D();
        obj.show(); 
    }
}