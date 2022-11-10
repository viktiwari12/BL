import java.util.Stack;

import javax.print.attribute.standard.MediaSize.NA;

class intro{
    static class student{ // Note that this does noit hae any physical significance || It is just a structure
        String name ;
        int roll;
        int mobile;
        String pname;
        String desig;

        // Note this is a method 
        public  void display(){ // we can have function/methods inside a class 
            System.out.println("Name :- " +  this.name);
            System.out.println("Roll :- " +  this.roll);
            System.out.println("Mobile :- " +  this.mobile);
            System.out.println("P-Name :- " +  this.pname);
            System.out.println("Desig:- " +  this.desig);
        }
    
       
        // Note: This is a constructor 
        student(String name, int roll, int mobile, String pname, String desig ){ // this is a parameterise Constructor
            this.name = name;
            this.roll = roll;
            this.mobile = mobile;
            this.pname = pname;
            this.desig = desig;
        }

        // Note:- We can have multiple costructor in a class
        student(String name, String pname, String desig){
            name = name;
            pname = pname;
            desig = desig;
        }
        
    }
    public static void main(String[] args) {
       student s1 = new student(); // Here we created an object of a Student Class 
        // Writing/assining values 
       s1.name = "Vikash Tiwary";
       s1.roll = 18;
       s1.mobile = 9717;
       s1.pname = "djaosn";
       s1.desig = "Instructor";

       System.out.println(s1.name);
       // update 
       s1.name = "Manohar";
      

       student s3 = new student("Omkar", 10, 9890, "dlaofds", "Software Engineer");
       // Reading/ Printing 

       s1.display();
       
       s3.display();
        student s5 = new student("Amit", 0, 0, "gsfn", null);

       student s4 = new student("Piyush", "lfnapdnoa", "Frontend Engineer");
       s4.display();

       
    

       
       
    }
}