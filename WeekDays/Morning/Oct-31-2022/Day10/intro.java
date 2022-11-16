import java.util.Arrays;

class intro{
    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        //fib(n, arr);

        int cost[] = {20, 5, 10,40 ,15, 25};
        int wt [] = {1, 2, 3,8, 7, 4};
        int W = 10;

        //int profit  = kp(cost, wt, cost.length, W);

        int dp[][] = new int[W+1][cost.length+1];
        for(int dpp[]: dp){
            Arrays.fill(dpp, -1);
        }

        int pr2 = kp_memo(cost, wt, wt.length, W, dp);
        display2D(dp);
        System.out.println(dp[W][wt.length]);
        System.out.println(pr2);
    }
    public static int fib(int n, int arr[]){
        if(n <=1) return arr[n] = n;

        if(arr[n] != -1)return arr[n]; // do some checking and based upon that we might or might not return 
        int f1 = fib(n-1, arr);
        int f2 = fib(n-2, arr);

        return arr[n] = f1 + f2;

    }
    public static void display(int arr[]){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void display2D(int arr[][]){
        for(int ele[] : arr){
            display(ele);
        }
    }
    
    public static int kp(int cost[], int wt[], int idx, int W){ 
        System.out.println("Finding the maximum profit when I have  " + idx + "  items and the bag capacity is " + W);
        // base case -> will figure out in some time 
        if(idx == 0 || W == 0){
            System.out.println("Base Case Hit !");
            return 0;
        }

        // i have two choices 

        if(wt[idx-1] <= W){
            System.out.println("Here I have two choices ");
            int c1 = cost[idx-1] + kp(cost, wt, (idx -1) , W - wt[idx-1]); // first choice -> Pick the element 
            System.out.println("Profit When Picked the element is " + c1);
            int c2 =  kp(cost, wt, (idx -1), W) ; // Second Choice  ->  Don't pick the element
            System.out.println("Profit When Not Picked the element is " + c2);
            return Math.max(c1, c2);
        }else{
            System.out.println("Curretly I don't have any choice");
            int c2 =  kp(cost, wt, (idx -1), W) ; // Here I have just 1 choice ->  Don't pick the element
            System.out.println("Only possible profit I could generate " + c2);
            return  c2;
        }
    }
    public static int kp_memo(int cost[], int wt[], int idx, int W, int dp[][]){ 
       
        // base case -> will figure out in some time 
        if(idx == 0 || W == 0){
            
            return dp[W][idx] = 0;
        }

        // i have two choices 

        if(dp[W][idx ] != -1) return dp[W][idx];

        if(wt[idx-1] <= W){
            
            int c1 = cost[idx-1] + kp_memo(cost, wt, (idx -1) , W - wt[idx-1], dp); // first choice -> Pick the element 
           
            int c2 =  kp_memo(cost, wt, (idx -1), W, dp) ; // Second Choice  ->  Don't pick the element
            
            return dp[W][idx] = Math.max(c1, c2);
        }else{
            
            int c2 =  kp_memo(cost, wt, (idx -1), W, dp) ; // Here I have just 1 choice ->  Don't pick the element
           
            return  dp[W][idx] = c2;
        }
    }
}