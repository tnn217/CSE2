//////////////////////////////
//Tony Nikolov
//09/23/14
//hw04
//CourseNumber
//The semester during which a course is offered at Lehigh 
//is given by a 6 digit number. The first four digits give 
//the year, and the last two digits give the semester: 10 
//spring, 20 summer 1, 30 summer 2, and 40 fall. Write a 
//program that reads in a 6 digit number, makes sure that 
//it adheres to the above description, and then prints out 
//the semester and year.

import java.util.Scanner;
//  define a class
public class CourseNumber {
    
//  add main method
  public static void main(String[ ] args)   {
    //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User is prompted for six digit course number
      System.out.print(
        "Enter a 6 digit number giving the course semester-");
      //accepts user input
      if(myScanner.hasNextInt()){
      int courseNumber=myScanner.nextInt();      
          if(courseNumber>=186510 && courseNumber<=201440){
            int year=(int)(courseNumber/100);//use int to divide number by 100 and effectively round out the last 2 digits.
            int semester=(int)(courseNumber%100);//use remainder when dividing by 100 to get rid of leading 4 coefficients.
                //assign print statements to the various semesters
                if (semester==10){
                System.out.println("The course was offered in the Spring semester of "+year);
                }
                else if (semester==20){
                System.out.println("The course was offered in the Summer 1 semester of "+year);
                }
                else if (semester==30){
                System.out.println("The course was offered in the Summer 2 semester of "+year);
                }
                else if (semester==40){
                System.out.println("The course was offered in the Fall semester of "+year);
                }
                else{
                System.out.println("Did not enter valid semester");    
                }
          }
          else{
            System.out.println("The number was outside the range 186510,201440");  
          }      
      }
      else{
            System.out.println("You did not enter an int");
            return; //leaves the program, i.e. the program terminates
      }
  }  //end of main method   
} //end of class