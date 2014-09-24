//////////////////////////////
//Tony Nikolov
//09/23/14
//hw04
//TimePadding
//Write a program that has the user enter an positive 
//integer giving the number of seconds that have passed 
//during the day and then displays the time in 
//conventional form.

import java.util.Scanner;
//  define a class
public class TimePadding {
    
//  add main method
  public static void main(String[ ] args)   {
    //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User is prompted for tim ein seconds
      System.out.print(
        "Enter the time in seconds-");
      //accepts user input
      if(myScanner.hasNextInt()){
      int timeSeconds = myScanner.nextInt();
      int hours=timeSeconds/3600;//finds the integer value when taking second value and converting to hours.
      int minutes=(timeSeconds%3600)/60;//takes remainder of hour value in seconds and converts it to minutes in integer form.
      int seconds =(timeSeconds%60);//takes remainder of minute value in seconds in integer form.
      System.out.println("The time is"+hours+":"+minutes+":"+seconds);
      }
      else{
            System.out.println("You did not enter an int");
            return; //leaves the program, i.e. the program terminates
      }
  }  //end of main method   
} //end of class