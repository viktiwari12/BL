package Morning.Day1;

class intro {
    public static void main(String[] args) {
        // Output Command || Print Statement

        // This is a comment || Computer willnnever read it , it is just for the user

        // System.out.print("Hello Everyone! I am Vikash & I am going to learn Java");

        // System.out.print("Hey Vikash, I am Amit & I am also learning Java");

        System.out.println("Hello Everyone! I am Vikash & I am going to learn Java");

        // Variables & Data Types

        // Numbers -> 19, 50, 38 || Characters -> 'c' 'k' '&' || String -> "Vikash
        // Tiwary" || Boolean true/false

        // Interger
        int x = 10;

        // Characters
        char ch = '$';

        // String

        String str = "Hey What's up?";

        boolean bool = true;
        boolean bool2 = false;

        // https://www.javatpoint.com/java-data-types <- Read the article for more
        // detailed explanation of Data Types

        // System.out.println("Hello Vikram, How are you? ");
        // System.out.println("Hello Vikram, How are you? ");
        // System.out.println("Hello Vikram, How are you? ");
        // System.out.println("Hello Vikram, How are you? ");
        // System.out.println("Hello Vikram, How are you? ");

        // Loops -> It help us to do the same task again and again

        // while Loop  -> Initilation, conditioncheck , updataion happens in 3 different lines/places

        int count = 1; // initaliation 

        while(true){ // condition check 
            // work 
            System.out.println("Hello Vikram, How are you? ");

            count = count +1; // count++ || count += 1
        }


        // for loop  -> Initilation, conditioncheck , updataion happens in 3 single  line/place
        // for(int i = 1; i <=10; i++){
        //     System.out.println("Hello Rishab, How are you? ");
        // }

        // // Do while -> Initilation, conditioncheck , updataion happens in 3 different lines/places, but there is a trick 
        // int j = 1;
        // do {
        //     System.out.println(j);
        // } while (j<= 0);

        int ans = sum1(10, 20);
    }
    public static void sum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("The sum of  " + n1 + "   and    " + n2 + "   is  "  + sum);
    }

    public static int sum1(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("The sum of  " + n1 + "   and    " + n2 + "   is  "  + sum);

       sum(50, 30);
    }


}