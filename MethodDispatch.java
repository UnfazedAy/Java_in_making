class A {
    public void show() {
        System.out.print("In A Show");
    }
}

class B extends A{
    public void show() {
        System.out.print("In B Show");
    }
}

public class MethodDispatch {
    public static void main(String[] args) {
    /* You can have the child object for the parent variable
        method dispatch
    */
        A obj = new B();
        obj.show();
    }
}
