//////////////////////////////
//Tony Nikolov
//09/11/14
//lab03
//Big Mac Program
//This lab will demonstrate how the user can use inputs to perform computations and yield specific results
//Write a program that computes the cost of buying a some Big Macs.  It uses the Scanner class to obtain from the user how many Big Macs, 
//the cost per Big Mac, and the percentage tax (which depends on the state; 6% in PA, 8% in MA, etc). It then displays the total cost.
//import Scanner class to avoid compile error
import java.util.Scanner;
//  define a class
public class BigMac {
    
//  add main method
  public static void main(String[ ] args)   {
      //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User prombpted for the number of tickets
      System.out.print(
        "Enter the number of Big Macs(an integer > 0): ");
      //accepts user input
      
      int nBigMacs = myScanner.nextInt();
      
      //prompts the user for the cost of a Big mac and the percent sales tax and to accept the input
      System.out.print("Enter the cost per Big Mac as"+" a double (in the formxx.xx):");
      double bigMac$=myScanner.nextDouble();
      System.out.print("Enter the percent tax as a whole number (xx):");
      double taxRate=myScanner.nextDouble();
      taxRate/=100; //user enters percent, but i want proportion
        
      //Print out the output using all of the user inputs above
      double cost$;
      int dollars,      //whole dollar amount of cost
        dimes, pennies; //for storing digits
            //to the right of the decimal point
            //for the cost$
      cost$=nBigMacs*bigMac$*(1+taxRate);
      //get the whole amount, dropping decimal fraction
      dollars=(int)cost$;
      //get dimes amount, e.g.,
      //(int)(6.73*10)%10->67%10->7
      //where the % (mod) operator returns the remainder
      //after the division: 583%100->83, 27%5->->2
      dimes=(int)(cost$*10)%10;
      pennies=(int)(cost$*100)%10;
      System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per bigMac, with a "+" sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
        }  //end of main method   
} //end of class

      
      