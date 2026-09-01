import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        while (s > 0) {
            int dig = s % 10;
            s = s / 10;
            System.out.println(dig);

        }

    }

}
