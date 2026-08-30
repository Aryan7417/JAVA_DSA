import java.util.*;

public class scanner {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.nextLine());
          String name = sc.nextLine();
          System.out.println("Dear " + name + " . here is a coounting");

          for (int i = 1; i <= n; i++) {
               System.out.println(i);
          }

     }
}