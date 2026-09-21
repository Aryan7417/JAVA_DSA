import java.util.LinkedList;
import java.util.Queue;

public class basics {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(50);
        q.add(10);
        q.add(20);
        q.add(40);
        System.out.println("for print :" + q);
        q.remove();
        System.out.println("after removing :" + q);
        System.out.println("peek:" + q.peek());
        System.out.println("size:" + q.size()); // for size
    } 
}