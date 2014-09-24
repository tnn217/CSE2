//////////////////////////////
//Tony Nikolov
//09/19/14
//hw04
//Write a program that prompts the user to enter an integer 
//for the month (1 for January, 2 for February, etc.)  and 
//then displays the number of days in the month).  
//If the number 2 is entered (February) the user is then 
//asked to enter the year. Make sure that the user enters an 
//integer for the month and that the integer is in the required range. 
//Similarly, if the year is requested, ensure that an int is entered, 
//and that the int is positive.

import java.util.Scanner;
//  define a class
public class Month {
    
//  add main method
  public static void main(String[ ] args)   {
       //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User is prompted for month number
      Scanner febScanner;
      //call the Scanner constructor and construct an instance of the Scanner class          
      febScanner = new Scanner( System.in );
            
      System.out.print(
        "Enter an int giving the number of the month(1-12)-");
      //accepts user input
      //make sure number entered is an integer
      if(myScanner.hasNextInt()){ 
          int monthNumber=myScanner.nextInt();
            //all of the months with 31 days are listed in numerical format, and the appropriate statement is printed.
            if (monthNumber==1||monthNumber==3||monthNumber==5||monthNumber==7||monthNumber==8||monthNumber==10||monthNumber==12){
                System.out.println("The month has 31 days.");    
            }
            //else if statement used for the remaining months with 30 days.
            else if (monthNumber==4||monthNumber==6||monthNumber==9||monthNumber==11){
                System.out.println("The month has 30 days.");    
            }
            
            //Since February is a special month, it gets special code.
            //Must declare an instance of the Scanner object
                
            else if (monthNumber==2){
                //Ready to accept input. User is prompted for year
                System.out.print(
                  "Enter an int giving the year-");
                //accepts user input
                if(febScanner.hasNextInt()){ 
                    int year=febScanner.nextInt();
                    //if the year is divisible by 4 and not 100, it is a leap year
                    if ((year%4==0)&&(year%100!=0)){
                        System.out.println("The month has 29 days.");    
                    }
                    //if it is divisible by 100 and 4, then it must also be divisible by 400 to be a leap year
                    else if ((year%4==0)&&(year%100==0)&&(year%400==0)){
                        System.out.println("The month has 29 days.");
                    }
                    //if the year is not divisible, it is not a leap year
                    else{
                        System.out.println("The month has 28 days.");
                    }
                }    
                else{
                System.out.println("You did not enter an int");
                return; //leaves the program, i.e. the program terminates
                }
            }//end of special instance for February...................
            
            //if a number not between 1 and 12 was not entered, then an error message appears.
            else{
            System.out.println("You did not enter an int");
            return; //leaves the program, i.e. the program terminates
            }
      }// end of intial if statement verifying if input was an integer.
      else{
        System.out.println("You did not enter an int");
        return; //leaves the program, i.e. the program terminates
      }
    }  //end of main method   
} //end of class