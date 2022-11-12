import java.util.Stack;

public class intro {
    public static void main(String[] args) {
        // Here we will learn Stack

        // How to initiliase a stack
        Stack<Integer> st = new Stack<>();

        // How to add an element in the stack
        st.push(10);
        int x = st.peek(); // it will simpally just read the element at the top

        System.out.println(x);
        System.out.println(st);
        st.push(20);
        x = st.peek(); // it will simpally just read the element at the top

        System.out.println(x);
        System.out.println(st);
        st.push(30);
        x = st.peek(); // it will simpally just read the element at the top

        System.out.println(x);
        System.out.println(st);
        st.push(40);
        x = st.peek(); // it will simpally just read the element at the top

        System.out.println(x);
        System.out.println(st);
        st.push(50);
        x = st.peek(); // it will simpally just read the element at the top

        System.out.println(x);
        System.out.println(st);
        st.push(10);
        System.out.println(st);
        x = st.peek(); // it will simpally just read the element at the top

        System.out.println(x);
        st.push(60);
        System.out.println(st);

        // reading the element

        x = st.peek(); // it will simpally just read the element at the top

        System.out.println(x);

    }
}
