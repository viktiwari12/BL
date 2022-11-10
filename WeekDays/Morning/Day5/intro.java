

public class intro {
    public static void main(String[] args) {


        // https://www.w3schools.com/java/java_ref_string.asp
        String str = "Vikash";

        String str2 = "Hey WHat's up? I a Learning String Class today.";
        String st = str2.toUpperCase();

        System.out.println(st);

        // We need to just study the method/functions of strings 


        // We can Find the Length of the string
        int len = str.length(); // Note, here .length is a method of string class 

        System.out.println(len);
        // int arr[] = new int[10];

        // int len2 = arr.length;

        // access the characters of a string 
        char ch = str.charAt(3);
        System.out.println(ch);
        boolean bo = str.equals(str2);

        System.out.println(bo);
        String str3 = ""; // it's length is zero
        String str4 = " "; // it's length is one || Here we have one character i.e space 


        int num = 112345;
        

        String stt = String.valueOf(num);
        System.out.println(stt);
        System.out.println(stt.length());
        
        String sttt = Integer.toString(num);
        System.out.println(sttt);
        System.out.println(sttt.length());


        String ok = str + str2;
        
    }
}
