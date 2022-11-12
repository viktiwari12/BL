import java.util.Stack;

public class into2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        for(int i = 1; i<=5; i++){
            st.push(i);
        }
        int arr[] = new int[10];

        
        for(int i = 1; i<=5; i++){
            System.out.println(st.pop()); // Pop also reads the element at the top but at the same time it removes also 
            System.out.println("Size of the Stack ->  "+ st.size());
            // it is my choice weater I want to store it anywhere elese or not 
        }


    }
    public static boolean db(String str){ // duplicate bracket 

        Stack<Character> st = new Stack<>();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                st.push(ch);
            }else{
                if(!st.empty() && st.peek() == '(' ) return false;
                else{
                    while(!st.empty() && st.peek() != '('){
                         st.pop();
                    }
                    st.pop();  
                }
            }
        }
        return true;
    }

    public static boolean bb(String str){ //balanced bracket 

        return false;
    }

    public static int[]ngetl(int arr[]){
        // come and make an ans array 

        int ans[] = new int[arr.length];

        // make a stack will store greater elements only 

        Stack<Integer> st = new Stack<>();

        ans[0] = -1;
        st.push(arr[0]);
        for(int i = 1; i< arr.length; i++){

            while(!st.empty() && st.peek() < arr[i]){
                 st.pop();
            }

            ans[i] = st.empty()? -1: st.peek(); // ternery operator 

            st.push(arr[i]);
        }

        return ans;
    } 

    public static int lah(int arr[]){ // Largest rea Histogram 
        // First go can calculate NSETL & NSETR

        int NSETL [] = new int[arr.length];
        int NSETR [] = new int[arr.length];

        int ans = 0;
        for(int i = 0; i< arr.length; i++){
            int currArea = arr[i] * ( NSETR[i] - NSETL[i] - 1); // Area -> Width * height 

            ans = Math.max(ans, currArea);
        }
        return ans;
    }
}
