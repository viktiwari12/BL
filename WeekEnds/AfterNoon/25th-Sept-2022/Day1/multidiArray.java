

public class multidiArray {
    public static void main(String[] args) {
        // 2-D Array 

        
        int []arr1 = new int[50];
        int []arr2 = new int[50];
        int []arr3 = new int[5];
        int []arr4 = new int[54];
        int []arr5 = new int[15];
        int []arr6 = new int[25];
        int []arr7 = new int[45];
        int []arr8 = new int[85];
        int []arr9 = new int[95];
        int []arr10 = new int[105];
        

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);
        System.out.println(arr6);
        System.out.println(arr7);
        System.out.println(arr8);
        System.out.println(arr9);
        System.out.println(arr10);

        int [][]arr = new int[10][];

        for(int[] ele : arr){
            System.out.print(ele + "   ");
        }
        System.out.println();
        
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        arr[3] = arr4;
        arr[4] = arr5;
        arr[5] = arr6;
        arr[6] = arr7;
        arr[7] = arr8;
        arr[8] = arr9;
        arr[9] = arr10;

    
        for(int[] ele : arr){
            System.out.print(ele + "   ");
        }
        
    }
}
