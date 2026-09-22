import java.net.FileNameMap;
import java.util.LinkedList;
import java.util.Queue;

public class queue2 {

    private  int finalwinner(int n , int k ){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=n;i++){
            q.add();
        }

        while (q.size()>1) {

            for(int i =1;i<=k-1;i++){
                q.add(q.remove());
            }
            return q.peek();
            
        }
    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(30);
        q.add(50);
        q.add(60);
        q.add(230);  
        q.add(1540);
        q.add(70);
        
        
        
    }
    
}
