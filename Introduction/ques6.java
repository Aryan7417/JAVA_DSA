import java.util.*;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int inv = 0;
        int op = 1;
        while (s != 0) {
            int od = s % 10;
            int id = op;
            int ip = od;

            inv = inv + id * (int) Math.pow(10, ip - 1);

            s = s / 10;
            op++;
        }
        System.out.println(inv);
    }

}