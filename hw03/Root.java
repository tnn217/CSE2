//////////////////////////////
//Tony Nikolov
//09/15/14
//hw03
//Root Program
////Write a program that prompts the user to enter a double 
//and then prints out a crude estimate of the cube root of the 
//number and the value of this crude guess when cubed.
//import Scanner class to avoid compile error
import java.util.Scanner;
//  define a class
public class Root {
    
//  add main method
  public static void main(String[ ] args)   {       
      //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User prompted
      System.out.print(
        "Enter ta double, and I print its cube root(a double > 0): ");
      //accepts user input
      
      double number = myScanner.nextDouble();
      //storing of all guess values
      double rootGuess, impRootGuess, thirdRootGuess, fourthRootGuess, fifthRootGuess, sixthRootGuess;
      rootGuess=number/3;
      impRootGuess=(rootGuess*rootGuess*rootGuess+number)/(3*rootGuess*rootGuess);
      thirdRootGuess=(impRootGuess*impRootGuess*impRootGuess+number)/(3*impRootGuess*impRootGuess);
      fourthRootGuess=(thirdRootGuess*thirdRootGuess*thirdRootGuess+number)/(3*thirdRootGuess*thirdRootGuess);
      fifthRootGuess=(fourthRootGuess*fourthRootGuess*fourthRootGuess+number)/(3*fourthRootGuess*fourthRootGuess);
      sixthRootGuess=(fifthRootGuess*fifthRootGuess*fifthRootGuess+number)/(3*fifthRootGuess*fifthRootGuess);
      System.out.println("The cube root is"+sixthRootGuess);
  } //end of main method
} //end of class