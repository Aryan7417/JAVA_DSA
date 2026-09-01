import java.util.*;
import java.io.*;;

public class ques2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i >= high; i++) {
            int count = 0;

            for (int div = 2; div * div <= 0; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }

    }
}
