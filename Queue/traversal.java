import java.util.LinkedList;
import java.util.Queue;

public class traversal {

    private static void dispaly(Queue<Integer> q) {
        int n = q.size();
        for (int i = 1; i <= n; i++) {
            System.out.println(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();

    }

    private static void addATIndex(Queue<Integer> q, int idx, int val) {
        int n = q.size();
        for (int i = 1; i <= idx; i++) {
            q.add(q.remove());
        }

        q.add(val);
        for (int i = 1; i <= n - idx; i++) {
            q.add(q.remove());
        }

    }

    private static int peeks(Queue<Integer> q, int idx) {
        int n = q.size();
        for (int i = 0; i <= n - idx; i++) {
            q.add(q.remove());
        }
        return q.peek();

    }

    private static int removes(Queue<Integer> q, int idx) {
        int n = q.size();
        for (int i = 0; i <= q.size() - idx; i++) {
            q.add(q.remove());

        }
        return q.remove();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(20);
        q.add(40);
        q.add(50);
        q.add(60);
        addATIndex(q, 2, 45);
        peeks(q, 1);
        removes(q, 0);
        dispaly(q);

    }

}
