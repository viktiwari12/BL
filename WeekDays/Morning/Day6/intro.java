
public class intro {
    public static void main(String[] args) {

        // Today we are Studying Recursion 
            // Recursion is simpally Calling a function by itSelf.

        // Let's dig deep and try to understand what actually means by calling a function by itself.




        // Print 5 times "Hey Vikash, how are you?"

        // One of the ways to print
        System.out.println("Hey Vikash, how are you?"); // task was simpally print this line 5 times
        System.out.println("Hey Vikash, how are you?");
        System.out.println("Hey Vikash, how are you?");
        System.out.println("Hey Vikash, how are you?");
        System.out.println("Hey Vikash, how are you?");

        // 2nd way to do the same task => Using loops

        for (int i = 1; i <= 5; i++) { // we can also use while loop
            System.out.println("Hey Vikash, how are you?"); // here also the task was to print this line line 5 times ,
                                                            // loop helped us to eleminate no of lines of code
        }

        // Now we have some condition 
        // we can only print a msg once from a function and call the the function only once from the main
        greet(); // My expectation here was simpally it will print msg only once 
        greet1();
        greet2();
        greet3();
        greet4();

        // My mood is changed now & I changed the condition & The new Condition is 

        // You can call only one function from the main & You can only print the msg once from one function 

        greeting(); // What you thaught while wirting this? or What was ur expectation ? 
        // Expetation was that this function will print 5 times 

        // Recursion starts here
        recursion();

        // Expectation -> Faith > Task 




    }


    // the real recursion begins here 
    
    public static void recursion() { // this is a function 
        System.out.println("Hey Vikash, how are you?");
        recursion(); // I am calling a function from a function
    }

    // Work after the condition changed 

    // Expectation -> Faith > Task 
    public static void greeting() { // this is a function 
        System.out.println("Hey Vikash, how are you?"); // I did this task (Print once )
        greeting1(); // Here I applied a faith that it will print the msg rest 4 times // I am calling a function from a function
    }
    public static void greeting1() { // this is also a function 
        System.out.println("Hey Vikash, how are you?"); // did the task 
       
        greeting2();// // Here I applied a faith that it will print the msg rest 3 times
    }
    public static void greeting2() { // this is also a function 
        System.out.println("Hey Vikash, how are you?");
        greeting3();// Here it is faith 
    }
    public static void greeting3() { // Here it is expectation  // this is also a function 
        System.out.println("Hey Vikash, how are you?");
        greeting4();
    }
    public static void greeting4() { // this is also a function 
        System.out.println("Hey Vikash, how are you?");
    }


    // th4e first task


     
    public static void greet() {
        System.out.println("Hey Vikash, how are you?");
    }
    public static void greet1() {
        System.out.println("Hey Vikash, how are you?");
    }
    public static void greet2() {
        System.out.println("Hey Vikash, how are you?");
    }
    public static void greet3() {
        System.out.println("Hey Vikash, how are you?");
    }
    public static void greet4() {
        System.out.println("Hey Vikash, how are you?");
    }





}
