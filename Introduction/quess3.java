import java.util.*;

public class quess3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i <= f; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

    }

}
