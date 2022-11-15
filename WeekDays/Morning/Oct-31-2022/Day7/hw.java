
public class hw {
    public static void main(String[] args) {
        fun(3);
    }
    // This will lead to the Introduction of Dynamic Programing 
    // Predict the Output 
    public static void fun(int n){ // Dry Run this one for n = 3
        //base case 
        if(n == 0) return;

        System.out.println("Print n for first time  calling function 1st time  ::" + n);

        fun(n-1);
        System.out.println("Print n for second time calling function 2nd time  :" + n);

        fun(n-1);
        System.out.println("Print n for Third and finally returning back :" + n);
    }

    public static void fun2(int n){ // Dry run this one for n = 5
        //base case 

        if(n <= 0) return;

        System.out.println("Print n for first time :" + n);

        fun(n-1);
        System.out.println("Print n for second time after calling function 1st time  :" + n);

        fun(n-2);
        System.out.println("Print n for Third time after calling function 2nd time  :" + n);
    }
}
