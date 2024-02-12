interface Hay {
    void show();
    void config();
}

class Bee implements Hay {

    @Override
    public void show() {
        System.out.println("In show");
    }
    @Override
    public void config() {
        System.out.println("In config");
    }
}

public class Interface {
    public static void main(String[] args) {
        Bee obj = new Bee();
        obj.show();
        obj.config();
    }
}