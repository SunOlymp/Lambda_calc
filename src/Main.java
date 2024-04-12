public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        try {
            int c = calc.devide.apply(a, b); // a = 3 и b =0, но, на 0 делить нельзя.
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }
}