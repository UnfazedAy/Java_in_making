public class Multiplication {
    public void Multiply(int tablesize) {
        for (int i = 1; i <= tablesize; i++) {
            for (int j = 1; j <= tablesize; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Multiplication mul = new Multiplication();
        mul.Multiply(12);
    }
}
