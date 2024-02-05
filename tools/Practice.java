package tools;
import java.util.ArrayList;

class Bungalow {
    public void properties() {
        System.out.println("Some rooms, living room, kitchen, and toilet");
    }
}

public class Practice {
    public static void main(String[] args) {
        Bungalow house = new Bungalow();
        house.properties();

        // Create an ArrayList and add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");

        // Retrieve an element using get
        String element = list.get(1);
        System.out.print("Element at index 1: " + element);
    }
}
