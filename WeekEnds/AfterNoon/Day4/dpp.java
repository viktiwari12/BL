import java.util.Arrays;

class dpp{
    public static void main(String[] args) {
        int dp[] = new int[15];
        Arrays.fill(dp, -1);
        System.out.println(fibDP(14, dp));
    }
    public static int fib(int n){
        // base case 
        if(n <= 1){
            System.out.println("Hitting base case");
            return n;
        }
        // faith
        System.out.println("Calcuating the fibonacci of  " + n);
        System.out.println("First go and calculate fibonacci of  " + (n -1));
        int f1 = fib(n-1);
        System.out.println("Recieving the value of F1 for   " + n + "   -> " + f1);
        System.out.println("Now  go and calculate fibonacci of  " + (n -2));
        int f2 = fib(n -2);

        System.out.println("Recieving the value of F2 for   " + n + "   -> " + f2);


        System.out.println("Finally calculating the  fibonacci of  " + n);
        int ans = f1 + f2;

        System.out.println("Fibonacci of  " + n + "   is   " + ans);
        return ans;
    }

    public static int fibDP(int n, int dp[]){
        // base case
        if(n <= 1){
            System.out.println("Hitting base case, so will frirst store and then return ");
            return dp[n] = n;
        }

        System.out.println("Checking id Fibbonacci of " + n + "   has been calculated earliewr or not");
        if(dp[n] != -1){

            System.out.println("Wohho !   Fibonacci of   " + n + "   has alreaady been calculated, now just return that value.");
            return dp[n];
        }


        
        System.out.println("Shit !  Fibonacci of "+ n + "  has not been calculated earlier, go and Calcuate  the fibonacci of  " + n);
        System.out.println("First go and calculate fibonacci of  " + (n -1));
        int f1 = fibDP(n-1, dp);
        System.out.println("Recieving the value of F1 for   " + n + "   -> " + f1);
        System.out.println("Now  go and calculate fibonacci of  " + (n -2));
        int f2 = fibDP(n -2, dp);

        System.out.println("Recieving the value of F2 for   " + n + "   -> " + f2);


        System.out.println("Finally calculating the  fibonacci of  " + n);
        int ans = f1 + f2;

        System.out.println("Fibonacci of  " + n + "   is   " + ans);

        System.out.println("Storing the ans of  " + n + "  into dp" );
        return dp[n] = ans;


    }


    public static int cb(int n ){
       if(n < 0) return 0; // no possible ways 
       if(n == 0) return 1; // return 1 -> I have found a way 
     

       
       

       // faith 
       int f1 = cb(n-1);
       int f2 = cb(n-2);

       // work -> add both the faith

       int work = f1 + f2;
       return  work;
   }
}