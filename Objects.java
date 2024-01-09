public class Objects {
    static class Calculator {
        public int add(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }
        public float divide(int a, int b) {
            if (b == 0) {
                System.out.println("Can't divide by Zero");
                return Float.NaN; // Return NaN (Not a Number) for division by zero
            } else {
                return ((float) a / b); // Cast one operand to float for floating-point division
            }
        }
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;  
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        float result2 = calc.divide(3, 0);
        System.out.println(result);
        System.out.println(result2);
    }
}
