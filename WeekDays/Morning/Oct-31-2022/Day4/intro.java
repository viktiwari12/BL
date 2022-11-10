
public class intro {
    public static void main(String[] args) {
        // We will start 2-D arrays
        int[][] arr = new int[5][];

        arr[0] = new int[5];
        arr[1] = new int[10];
        arr[2] = new int[8];
        arr[3] = new int[20];
        arr[4] = new int[15];

        System.out.println("Address of the main array " + arr);
        System.out.println("length of the main array " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Addreass  of the array  stored at " + i + "th  place is " + arr[i]);
            System.out.println("Lenght of the array stored at " + i + "th  place is " + arr[i].length);
        }
        display(arr);

        System.out.println("Display the same array using another method");
        display2D(arr);

    }

    // display a 20-D array
    public static void display(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    // a function to print 1D array
    public static void display1D(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void display1DRev(int arr[]) {
        for (int i = arr.length-1; i>=0; i-- ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void display2D(int arr[][]){
        for (int ele[] : arr) {
           display1D(ele);
        }
    }
    public static void display2DAlter(int arr[][]){
        boolean flag = true;
        for (int ele[] : arr) {
            if(flag){
                display1D(ele);
                flag = false;
            }else{
                display1DRev(ele);
                flag = true;
            }
        }

    }
    
}
