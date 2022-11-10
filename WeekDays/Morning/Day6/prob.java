

public class prob {
    public static void main(String[] args) {
        printDec(5);
    }
    public static void printDec(int n){ // Here the Expectation is to print n ->  1 in decreasing order
        // Base Case 
        if(n == 0){
            System.out.println("Hitting Base Case");
            return;
        }

        System.out.println("Calling function with the vaule of N -> " + n);
        // task -> Print the nth number 
        System.out.println(n);

        // now apply faith 
        System.out.println("Having faith that the function will print the rest values starting from-> " + (n-1));
        printDec(n-1);
    }

    // Hw 

    //Q-1 :- Print Increasing 
    // Q2 :- Factoral 
    // Q3 :- Power (a^b)

    // Note :- I am not looking for codes :- I only need ans in terms of faith expectatipon nad task 
}
