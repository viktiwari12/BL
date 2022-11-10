
public class intro {

    public static void main(String[] args) {

        int num = 10;
        System.out.println(num);
        int vikash[] = new int[100];
        System.out.println(vikash);

        int arr[] = new int[9];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1 ; // assingment || writing 
        }


        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
    }
    public static void display(int arr[]){
        System.out.println("Display the Array in it's original order");
        for(int i = 0; i<= arr.length -1; i++){
            System.out.println(arr[i]);
        }
    }
    public static void displayReverse(int arr[]){

        System.out.println("Display the Array in reverse order");
        for(int i = arr.length -1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void maxArr(int arr[]){

        System.out.println("Display the Maximum element array");

        int curr_max = arr[0];
        for(int i = 1; i<= arr.length -1; i++){
           if(arr[i] > curr_max){
            curr_max = arr[i];
           }
        }
    }
    public static void minArr(int arr[]){
        System.out.println("Display the Maximum element array");

        int curr_min = arr[0];
        for(int i = 1; i<= arr.length -1; i++){
           if(arr[i] < curr_min){
            curr_min = arr[i];
           }
        }
    }
    public static void reverse(int arr[]){
        int st = 0;
        int end = arr.length-1;
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
}
