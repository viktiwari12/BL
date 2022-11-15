

public class intro {
    public static void main(String[] args) {
        int n = 6; // total no of stairs 

        int ans = cb(n, "");

        System.out.println(ans);
    }
    public static int cb(int n, String psf){
        if(n== 0){
            System.out.println(psf);
            return 1; // means I have found a path
        }
        if(n <0) return 0; // overflow which means no path available 
        int j1 = cb(n-1, psf+"j1 -> ");
        int j2 = cb(n-2, psf+"j2 -> ");
        return j1 + j2;
    }

    //https://leetcode.com/problems/climbing-stairs/
    
}


    

