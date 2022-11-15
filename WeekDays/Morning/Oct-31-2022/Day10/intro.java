import java.util.Arrays;

class intro{
    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        fib(n, arr);
    }
    public static int fib(int n, int arr[]){
        if(n <=1) return arr[n] = n;

        if(arr[n] != -1)return arr[n]; // do some checking and based upon that we might or might not return 
        int f1 = fib(n-1, arr);
        int f2 = fib(n-2, arr);

        return arr[n] = f1 + f2;

    }
    public static int kp(int cost[], int wt[], int idx, int W){ 
        // base case -> will figure out in some time 
        if(idx < 0 || W <= 0) return 0;

        // i have two choices 

        if(wt[idx] <= W){
            int c1 = cost[idx] + kp(cost, wt, (idx -1) , W - wt[idx]); // first choice -> Pick the element 
            int c2 =  kp(cost, wt, (idx -1), W) ; // Second Choice  ->  Don't pick the element
            return Math.max(c1, c2);
        }else{
            int c2 =  kp(cost, wt, (idx -1), W) ; // Here I have just 1 choice ->  Don't pick the element
            return  c2;
        }
    }
}