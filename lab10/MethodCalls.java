//
//
//
//Tony Nikolov 
//CSE002  Lab10 10/31/14   HAPPY HALLOWEEN!
import java.util.Scanner;
public class MethodCalls{
     public static int addDigit(int a,int b){
     int output=0;
     if(a<0 && b>0){
         b=-b;
         a=-a;
         output=Integer.parseInt(Integer.toString(b)+Integer.toString(a));
         return output;
     }
     output=Integer.parseInt(Integer.toString(b)+Integer.toString(a));
     return output;
         
     }
     
     
     
    
     
     
     public static int join(int c,int d){
         int output=0;
         if(c<0 && d<0){
            c=-c;
            d=-d;
            output=Integer.parseInt(Integer.toString(c)+Integer.toString(d));
            return output;
         }    
         output=Integer.parseInt(Integer.toString(c)+Integer.toString(d));
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
