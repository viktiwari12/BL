class intro{
    public static void main(String[] args) {
        printInc(5);
    }
    public static void printInc(int n){
        // base case 
        if(n == 0) return;
        // faith -> Recursion will print from (n-1 -> 1) in Increasing Order 
        printInc(n-1);
        // Task is to Print the n
        System.out.println(n);
    }
    // find the factorial of n 
    public static int fact(int n){
        // base case 
        if(n == 1) return 1;

        // Expectation -> faith -> Work 
        // faith -> Recursion will give (n-1) factorial 
        int faith = fact(n-1);

        int ans = n * faith;
        return ans;
    }

    public static int pow(int a , int b){ //calculate a ^b
        // base case 
        if(b == 1) return a;
        // Expectation -> faith -> work
        
       //  a ^b -> a * a * a  * a * a  ( b times ) : a ^ (b-1) -> a * a * a  * a * a  ( b -1 times ) : a ^ b -> a *( a ^ b-1)

       int faith = pow (a, (b-1));

       int ans = a * faith;

       return ans;
    }
    public static int  sum(int n) { // n -> as an input : - find the sum till n 
        if(n == 0) return n;
        // 5 -> 5 + 4 + 3 + 2 + 1

       // n -> 1452514239; :- find the sum of all the digits 

        // i will extract the lasty digit 
        // and shorten the real input value 

       
        int faith = sum(n/10);
        int ans = faith  + (n % 10);
    }
}