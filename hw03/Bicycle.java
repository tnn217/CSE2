//////////////////////////////
//Tony Nikolov
//09/15/14
//hw03
//Bicycle Program
////Write a program that prompts the user to enter two digits, 
//the first giving the number of counts on a cyclometer and the second 
//giving the number of seconds during which the counts occurred, 
//and then an then prints out the distance traveled and the average miles per hour.  

//import Scanner class to avoid compile error
import java.util.Scanner;
//  define a class
public class Bicycle {
    
//  add main method
  public static void main(String[ ] args)   {       
      //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User prompted 
      System.out.print(
        "Enter the number of seconds:(an integer > 0): ");
      //accepts user input
      
      int nSeconds = myScanner.nextInt();
      
      //Ready to accept input. User prompted for the number of tickets
      System.out.print(
        "Enter the number of counts:(an integer > 0): ");
      //accepts user input
      
      int nCounts = myScanner.nextInt();
      
      double wheelDiameter=27.0, //Wheel Diameter constant
      PI=3.14159, //value of pi
      feetPerMile=5280, //number of feet in a mile
      inchesPerFoot=12, //number of inches in a foot
      secondsPerMinute=60; //number of seconds in a minute
      //60 minutes per hour as well so will reuse above number
      double mileDistance, nMinutes, nHours; //storing of values
      //the calculation for distance IN MILES is counts*wheel diameter*pi/in.per foot/ft.per mile
      double iMileDistance=(int)(nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile*100);
      mileDistance=(iMileDistance)/100;
      nMinutes=nSeconds/secondsPerMinute;
      nHours=nMinutes/secondsPerMinute;
      System.out.println("The distance was"+mileDistance+"miles and took "+nMinutes+"minutes.");
      System.out.println("The average mph was"+(mileDistance/nHours));
  } //end of main method
} //end of class