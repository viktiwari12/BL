class dp{
    public static void main(String[] args) {
        int wt[]; // weight array 
        int pr[]; // price array 
        int W; // Net capicity of bag 
    }
    public static int kp(int wt[], int pr[], int W, int idx , int DPP[][]){
        // base case 
        if(W <= 0  || idx == wt.lenght) return DPP[idx][W] =0;

        
        int profit = 0;

        if(DPP[idx][W]!= -1) return DPP[idx][W];
        if(wt[idx] <= W){
            int c1 = pr[idx] + kp(wt, pr, (W- wt[idx]), (idx+1));
            int c2 = 0 + kp(wt, pr, W, (idx+1));
            profit = Math.max(c1, c2);
        }else{
            profit =  0 + kp(wt, pr, W, (idx+1));
        }
        return DPP[idx][W] = profit;
    }

    public static int kp(int wt[], int pr[], int W, int idx , int DPP[][]){
        // base case 
        if( W <=0 || idx <0) return DPP[idx][W] =0;

        
        int profit = 0;

        if(DPP[idx][W]!= -1) return DPP[idx][W];
        if(wt[idx] <= W){
            int c1 = pr[idx] + kp(wt, pr, (W- wt[idx]), (idx-1));
            int c2 = 0 + kp(wt, pr, W, (idx-1));
            profit = Math.max(c1, c2);
        }else{
            profit =  0 + kp(wt, pr, W, (idx-1));
        }
        return DPP[idx][W] = profit;
    }
}