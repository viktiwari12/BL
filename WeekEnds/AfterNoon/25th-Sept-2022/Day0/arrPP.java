public class arrPP {
    public static void main(String[] args) {
        // display an array 
        // display the array in reverse 
        // find an element in an array 
        // add two arrays 
        // diff of two arrays
    }
    public static void display(int arr[]){
        // how to find the length of the array 
        int l = arr.length; 
        for(int i = 0; i<l; i++){  // (i<= l-1) == (i<l)
         System.out.print(arr[i] + "  ");   
        }
        System.out.println();


        // another way to dispaly an array 
        // for each loop 
        for(int ele : arr){
            System.out.print(ele + "  ");   
        }
        System.out.println();

    }
    public static void displayrev(int arr[]){
        for(int i = arr.length - 1; i>= 0; i--){
            System.out.print(arr[i] + "  ");   
        }
        System.out.println();
    }
    public static void findElement(int arr[], int ele){
        int idx = -1;
        for(int i = 0; i<arr.length; i++){  // (i<= l-1) == (i<l)
            if(arr[i] == ele){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
        
    }
    public static void Sum(int arr[]){
        
    }
    public static void Sumtwoarr(int a1[], int a2[]){
        int l1= a1.length;
        int l2 = a2.length;

        int l3 =( Math.max(l1, l2) +1);

        // form the ans array 
        int ans[] = new int[l3];

        int i = l1-1, j = l2 -1, k = l3-1, c = 0;
        while(i>= 0 || j>= 0){
            int num = c ;
            if(i>= 0) num += a1[i];
            if(j >= 0)  num += a2[j];
            ans[k] = num %10;
            c = num /10;
            i--;
            j--;
            k--;

        }
        if(c != 0) ans[k] = c;
        display(ans);
    }
    public static void difftwoarr(int arr[]){
        
    }
}
