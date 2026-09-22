class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    int remove(){
        if(size=0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }
}



public class MyQueue {
    Node head;
    Node tail;
    int size;

    void add(int val){
        Node temp = new Node(val);

        if(size == 0) head = tail = temp;
        else{

            tail.next = temp;
            tail = temp;
        }
        size++;
    }
}
