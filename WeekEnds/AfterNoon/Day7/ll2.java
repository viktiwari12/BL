import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javax.sound.midi.VoiceStatus;

public class ll2 {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        node head = null;

        head = new node(10);
        node curr = head;
        while (true) {
            int dt = scn.nextInt();
            if (dt == -1) {
                break;
            } else {
                addNode(curr, 20);
                curr = curr.next;
            }
        }
        Stack<Integer> st = new Stack<>();
    }

    public static void addNode(node curr, int data) {
        curr.next = new node(data);

        /*
         * node n1 = new node(data)
         * curr.next = n1;
         */
    }

    public static Void display(node head) {
        node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static Void addRandom(node head, node random, int data) {
        node curr = random;

        node n1 = new node(data);

        n1.next = random.next;
        random.next = n1;

    }

    public static Void addfirst(node head, int data) {
        node nh = new node(data);
        nh.next = head;
        head = nh;
    }

    public static Void addlast(node head, int data){
        node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        node nt = new node(data);
        curr.next = nt;
    }
    public static Void removeRandom(node head, node random, int data){
        node curr = head;
        while(curr.next != Random){
            curr = curr.next;
        }

        node x = curr.next;

        curr.next = curr.next.next;
        x.next = null;
        
    }



}
