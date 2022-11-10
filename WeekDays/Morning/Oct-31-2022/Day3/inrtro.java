
public class inrtro {
    public static void main(String[] args) {
        // First and the last index/ occurence 

        int arr[] = {1, 2, 3, 2, 2, 4, 2, 5};

        int frst = firstOccurence(arr, 2);

    }
    public static int firstOccurence(int arr[], int tar){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == tar) return i;
        }
        return -1;
        // int ans = -1;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] == tar){
        //         ans = i;
        //         break;
        //     }
        // }
        // return ans;
    }
    public static int lastOccurence(int arr[], int tar){
        for(int i =arr.length -1; i>=0; i--){
            if(arr[i] == tar) return i;
        }
        return -1;
        // int ans = -1;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] == tar){
        //         ans = i;
        //     }
        // }
        // return ans;
    }
    public static void rotate(int arr[], int k){ // tar here will be an index
        display(arr);
        int idx = arr.length -1 -k;

        // reverse the forst half
        reverse(arr, 0, idx);
        // reverse the second half 
        reverse(arr, idx+1, arr.length-1);

        // reve4rse the entire array 
        reverse(arr, 0, arr.length-1);
        display(arr);

    }
    public static void reverse(int arr[], int st, int end){
        while(st <end){
            swap(arr, st, end);
            st++;
            end--;
        }
    }
    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int arr[]){
        for(int ele : arr){
            System.out.print(ele + "  ");
        }
        System.out.println();
    }
}
