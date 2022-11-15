
public class intro {
    public static void main(String[] args) {
        
    }
    public static int fib(int n) {
        // base case 
        if(n <= 1) return n;

        // expectation -> to find nth fib no 
        // faith -> (n-1)th & (n-2nd ) fib no 
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        // task  -> add both the faith and form the nth fib number 

        int task = f1 + f2;
        return task;
    }
}
