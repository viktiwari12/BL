import java.util.ArrayList;

public class ll {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        
    }
    public static node midd(node head){
        if(head == null || head.next == null) return head;


        node fast = head;
        node slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static node rev(node head){

        if(head == null || head.next == null) return head;


        node pre = null;
        node curr = head;
        while(curr != null){
            // First create the backup!
            node temp = curr.next;
            curr.next = pre;
            // now comes the updation part 


            pre = curr;
            curr = temp;
        }
        node nh = pre;
        return nh;
        ArrayList 
    }
}
