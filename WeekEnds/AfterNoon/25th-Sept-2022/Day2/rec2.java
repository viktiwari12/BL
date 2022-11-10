
public class rec2 {
    public static void main(String[] args) {
        int n = 3;
        fun(n);
    }
    public static void printInc(int st, int n){
        // WORK -> 
        if(st > n) return;

        System.out.println(st); // work 
        // faith 
        printInc((st+1), n);
    }
    public static void printDec(int st, int n){
        // faith -> print from st +1 to n
        printDec(st+1, n);

        // work 
        System.out.println(st); 
    }
    public static void printIntcDec(int st, int n){
        // work 1 
        System.out.println("Invocking function as value of st ->      "  + st);
        if(st > n) return;
        System.out.println("Printing num before calling function");
        System.out.println(st); 
        printIntcDec((st+1), n);
        System.out.println("Printing num  After calling function");
        System.out.println(st); 
    }
    // expectation is to print n!
    public static int factorial(int n){
        // base case 
        if(n ==1 ) return 1;

        // faith -> (n-1)!
        int temp = factorial(n-1);
        // n * (n-1)!
        int ans = n * temp;
        return ans;


        // return n * factorial(n-1);
    }
    // expectation is sum till n 
    public static int sum(int n){
        if(n == 0) return 0;

        int faith = sum(n -1 );
        int work =faith + n;

        return work;
    }

    // Home Work 
    public static void fun(int n){
        // base case -> Figure out 
        if( n== 0) return;

        System.out.println("Pre " + n);
        fun(n -1);
        System.out.println("In " + n);
        fun(n-1);
        System.out.println("Post " + n);
    }

}
