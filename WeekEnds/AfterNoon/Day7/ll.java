
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
        int d1 = 10;
        node n1 = new node(d1);
        node head = n1;
        int d2 = 20;

        node n2 = new node(d2);
        n1.next = n2;

        int d3 = 30;

        node n3 = new node(d3);
        n2.next = n3;

        int d4 = 40;

        node n4 = new node(d4);
        n3.next = n4;
        int d5 = 50;

        node n5 = new node(d5);
        n4.next = n5;



        while(head != null){
            System.out.print(head.data + "  -> ");

            head = head.next;
        }

    }
}
