class functions {
    public static void main(String[] args) {
        // person 1
        int p1 = 10000;
        int t1 = 6;
        int r1 = 10;

        int si1 = (p1 * r1 * t1) / 100;

        // person 2
        // int p1 = 10000;
        // int t1 = 6;
        // int r1 = 10;

        // int si2 = (p1 * r1 * t1) / 100;

        // // person 3
        // int p1 = 10000;
        // int t1 = 6;
        // int r1 = 10;

        // int si3 = (p1 * r1 * t1) / 100;
        // // person 4
        // int p1 = 10000;
        // int t1 = 6;
        // int r1 = 10;

        // int s = si(p1, r1, t1);

        int num1 = 23523;
        int d1 = countDigit(num1);
        int num2  =256345746;
        int d2 = countDigit(num2);
    }

    public static int si(int p, int r, int t) {
        return (p * r * t) / 100;
    }

    // You have a number -> count the total no of digit in it 

    public static int countDigit(int n){
        // 3 parts of any loop 
        // Initilation 
        // condition check 

            // work 
            // updation 

        int dig = 0;

        while(n != 0){
            dig++; // work 

            n = n/10;
        }

        return dig;
    }
}