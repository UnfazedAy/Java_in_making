public class Inheritance {
    public static void main(String[] args) {
        AdvancedCalc obj = new AdvancedCalc();
        int sum = obj.add(5, 2);
        int sub = obj.sub(10, 3);
        float div = obj.divide(4, 2);
        int mul = obj.multiply(72, 4);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);
    }
}