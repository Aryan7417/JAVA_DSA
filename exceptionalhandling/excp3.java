public class excp3 {
    public static void main(String[] args) {
        System.out.println("step 1");

        methodA(3, 0);

    }

    private static void methodA(int a, int b) {
        methodB(a, b);
    }

    private static void methodB(int a, int b) {
        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("divided by zero");
        }

        System.out.println("hello ");
    }
}
