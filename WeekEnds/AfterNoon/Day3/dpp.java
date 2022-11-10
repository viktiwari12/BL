import java.util.Arrays;

public class dpp {
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];

        for(int i = 0; i< dp.length; i++){
            dp[i] = -1;
        }
        Arrays.fill(dp, -1);
    }
    public static int fib(int n , int dp[] ){
         if( n <=1 ) return dp[n] = n;
        // if(n == 1 ) return 1;
        // if(n == 0) return 1;

        
        // expectation -> nth fib 
        if(dp[n] != -1) return dp[n];

        // faith 
        int f1 = fib(n-1, dp);
        int f2 = fib(n-2, dp);

        // work -> add both the faith

        int work = f1 + f2;
        return dp[n] = work;
    }

    public static int factorial(int n){
        if(n == 5) return 120;


        return n * factorial(n-1);
    }
}
