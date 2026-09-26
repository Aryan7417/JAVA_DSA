import java.util.Stack;

public class que3ImplenetQueueUSuingStack {

    Stack<Intger> sst = new Stack<>();
    Stack<Integer> helper = new Stack<>();
     public MyQueue() {
        st.push(x);
        
    }
    
    public void push(int x) {
        
    }
    
    public int pop() {
        //st ka bottom remove kro
        while (st.size()>1) {
            helper.push(st.pop());
            
        }
        int front = st.pop();
        while (helper.size()>1) {
            st.push(helper.pop());            
        }
        return front;
    }
    
    public int peek() {
        while (st.size()>0) {
            helper.push(st.pop());
            
        }
        int front = st.peek();
        while (helper.size()>0) {
            st.push(helper.pop());            
        }
        return front;
        
    }
    
    public boolean empty() {
        return (st.size()==0);
    }
    
}
