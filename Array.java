public class Array {
    public static void main(String[] args) {
        // Below is a defined array in which we already know the values
        // int num[] = {5, 7, 9};
        // System.out.println(num[1]);

        // In this situation, we're defining a new array with a size of 4, dynamic
        int numbers[] = new int[4];
        numbers[0] = 5;
        numbers[1] = 8;
        numbers[2] = 10;
        numbers[3] = 15;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
