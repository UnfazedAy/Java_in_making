public class TryCatch {
    public static void main(String[] args) {
        int i = 3;

        try {
            int j = 18 / 0;
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println(i);
        System.out.print("Bye");
    }
}