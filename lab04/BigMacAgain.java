//////////////////////////////
//Tony Nikolov
//09/117/14
//lab04
//BigMacAgain
//Write a program that uses the Scanner class to obtain from 
//users how many Big Macs they want and whether they want 
//an order of fries. It then prints out the total cost of 
//the meal. Big Macs still cost $2.22 each,  and an order of 
//fries costs $2.15. 

import java.util.Scanner;
//  define a class
public class BigMacAgain {
    
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
      double bigMac=2.22;
      if(myScanner.hasNextInt()){
      int nBigMacs = myScanner.nextInt();
      //make sure int is greater than 0 using if/else statement. If so, then continue with the code, if else TERMINATE the program!
      double bigMacCost$=nBigMacs*bigMac;
      
      if (nBigMacs>0){
            System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"x"+bigMac+"="+bigMacCost$);
      }
        else{
            System.out.println("You did not enter a positive int");
            return; //leaves the program, i.e. the program terminates
        }
      //now see if the customer wants fries with that.
      double pFries=2.15;
      System.out.print(
        "Do you want an order of fries (Y/y/N/n)?");
        String fries = myScanner.next();
      double totalMacAndFries=bigMacCost$+pFries;
      if (fries.equals("Y")){       //for the next 2 cases, total price is from Big Macs and fries
            System.out.println("The total cost of the meal is $"+totalMacAndFries);
      }
        else if (fries.equals("y")){
            System.out.println("The total cost of the meal is $"+totalMacAndFries);
        }
        else if (fries.equals("N")){        //for the next 2 cases, total price is just from Big Macs
            System.out.println("The total cost of the meal is $"+bigMacCost$);
        }
        else if (fries.equals("n")){    
            System.out.println("The total cost of the meal is $"+bigMacCost$);
        }
        else{
            System.out.println("You did not enter Y,y,N,or n");
            return; //leaves the program, i.e. the program terminates
        }
      }
      else{
            System.out.println("You did not enter an int");
            return; //leaves the program, i.e. the program terminates
        }
        
            
            
        
  }  //end of main method   
} //end of class
