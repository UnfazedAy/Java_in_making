enum Laptop {
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    private  int price;

    Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
//        Laptop lap = Laptop.Macbook;
//        lap.setPrice(2000);
//        System.out.print(lap + " : " + lap.getPrice());

        // Trying to use to print all
        for (Laptop lap: Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}