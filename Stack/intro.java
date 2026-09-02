import java.util.*;

public class intro {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        System.out.println(st + "-_>" + st.peek() + " " + st.size());

        st.push(20);
        System.out.println(st + "-_>" + st.peek() + "  " + st.size());
        st.push(30);
        System.out.println(st + "-_>" + st.peek() + "  " + st.size());
        st.push(40);
        System.out.println(st + "-_>" + st.peek() + "  " + st.size());
        st.pop();
        System.out.println(st + "-_>" + st.peek() + "  " + st.size());
        st.pop();
        System.out.println(st + "-_>" + st.peek() + "  " + st.size());
        st.pop();
        System.out.println(st + "-_>" + st.peek() + "  " + st.size());
        st.pop();
        System.out.println(st + "-_>" + " " + st.size());

    }

}
