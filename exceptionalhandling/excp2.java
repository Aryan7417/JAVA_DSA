public class excp2 {
    public static void main(String[] args) {

        System.out.println("step1");
        
        try {
            int a = 3;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException e) {
            

            System.out.println("Divison by zero is not alllwed");
        }

        System.out.println("sterp3");

    }

}
