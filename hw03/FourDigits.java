//////////////////////////////
//Tony Nikolov
//09/15/14
//hw03
//FourDigits Program
////Write a program that prompts the user to enter a double 
//and  then prints out the first four digits to the right of 
//the decimal point. 
import java.util.Scanner;
//  define a class
public class FourDigits {
    
//  add main method
  public static void main(String[ ] args)   {       
      //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User prompted 
      System.out.print("Enter a double, and I display the four digits to the right of the decimal point(a double > 0): ");
      //accepts user input
      
      double number = myScanner.nextDouble();
      //storing of all guess values
      double newNumber=(int)(number);
      double endNumber=number-newNumber;
      double finalNumber=(endNumber*10000);
      double answer=(int)finalNumber;
      System.out.println("The four numbers are"+answer);
  } //end of main method
} //end of class