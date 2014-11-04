//
//
//
//Tony Nikolov 
//CSE002  Lab10 10/31/14   HAPPY HALLOWEEN!
import java.util.Scanner;
public class MethodCalls{
<<<<<<< HEAD
     public static int addDigit(int a,int b){//establish method for addDigit
     int output=0; //identify output as an int and set it to 0 initially
     if(a<0 && b>0){//for case where there is a negative number input, use this if statement
         b=-b;
         a=-a;//reassign the negative concluding integer as a positive and reassign the positive starting integer as a negative
         output=Integer.parseInt(Integer.toString(b)+Integer.toString(a));//use parseInt method to superimpose 2 integer values together without adding them.
         return output;//return the output to the initial call.
     }
     output=Integer.parseInt(Integer.toString(b)+Integer.toString(a));//same parseInt from above but this is for the positive input case
=======
     public static int addDigit(int a,int b){          //establish method for addDigit
     int output=0;  //identify output as an int and set it to 0 initially
     if(a<0 && b>0){     //for case where there is a negative number input, use this if statement
         b=-b;      
         a=-a;           //reassign the negative concluding integer as a positive and reassign the positive starting integer as a negative
         output=Integer.parseInt(Integer.toString(b)+Integer.toString(a));      //use parseInt method to superimpose 2 integer values together without adding them.
         return output;  //return the output to the initial call.
     }
     output=Integer.parseInt(Integer.toString(b)+Integer.toString(a));          //same parseInt from above but this is for the positive input case
>>>>>>> 8164060b2fe36d8a1c211ec93115c3373c22d565
     return output;
         
     }
     
     
     
    
     
     
<<<<<<< HEAD
     public static int join(int c,int d){ //join method is very similar to the addDigit method
         int output=0;
         if(c<0 && d<0){ //for the case where both integers are negative, reestablish them as positives and return a positive parsed value
=======
     public static int join(int c,int d){         //join method is very similar to the addDigit method
         int output=0;
         if(c<0 && d<0){      //for the case where both integers are negative, reestablish them as positives and return a positive parsed value
>>>>>>> 8164060b2fe36d8a1c211ec93115c3373c22d565
            c=-c;
            d=-d;
            output=Integer.parseInt(Integer.toString(c)+Integer.toString(d));
            return output;
         }    
<<<<<<< HEAD
         output=Integer.parseInt(Integer.toString(c)+Integer.toString(d));//this join method works for all positive values
=======
         output=Integer.parseInt(Integer.toString(c)+Integer.toString(d));      //this join method works for all positive values
>>>>>>> 8164060b2fe36d8a1c211ec93115c3373c22d565
         return output;
     }
    
     public static void main(String []  arg){
         int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90)); 
    }
}  
