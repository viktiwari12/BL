class num{
    static int i = 0;
    int x = 10;
}
public class st {
    
    public static void main(String[] args) {
        num n1 = new num();
        n1.display();
        n1.i = ((n1.i) +1);
        n1.display();


        num n2 = new num();
        n2.display();
        n2.i = ((n2.i) +1);
        n2.display();
    }
}
