import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.print.DocFlavor.INPUT_STREAM;

public class que1 {

    private static void reverses(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        while (q.size() > 0) {
            st.push(q.remove());
        }

        while (st.size() > 0) {
            q.add(st.pop());

        }
        System.out.println(q);

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        reverses(q);

    }

}
