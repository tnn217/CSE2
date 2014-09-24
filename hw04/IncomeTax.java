//////////////////////////////
//Tony Nikolov
//09/19/14
//hw04
//IncomeTax
//Write a program that prompts the user to enter an int 
//that gives the thousands of dollars of income and then 
//writes out the amount of tax on the income, 
//given the following (progressive) schedule:  
//<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.

import java.util.Scanner;
//  define a class
public class IncomeTax {
    
//  add main method
  public static void main(String[ ] args)   {
    //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User is prompted for income in thousands
      System.out.print(
        "Enter an int giving the number of thousands-");
      //accepts user input
      if(myScanner.hasNextInt()){
      
      int incomeThousands = myScanner.nextInt();
      int income$=incomeThousands*1000;  //find income in dollars
        
        if (incomeThousands<20){
          double taxProportion=0.05;
          double finalTax=income$*taxProportion;
          System.out.println("The tax rate on "+income$+" is 5.0%, and the tax is "+ finalTax); 
        }
        else if (incomeThousands>=20&&incomeThousands<40){
          double taxProportion=0.07;
          double finalTax=income$*taxProportion;
          System.out.println("The tax rate on "+income$+" is 7.0%, and the tax is "+ finalTax);
      }
        else if (incomeThousands>=40&&incomeThousands<78){
          double taxProportion=0.12;
          double finalTax=income$*taxProportion;
          System.out.println("The tax rate on "+income$+" is 12.0%, and the tax is "+ finalTax);
        }
      }//end of initial if statement verifying if input was an integer.
      else{
            System.out.println("You did not enter an int");
            return; //leaves the program, i.e. the program terminates
        }
    }  //end of main method   
} //end of class