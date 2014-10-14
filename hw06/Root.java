//////////////////////////////
//Tony Nikolov
//10/14/14
//hw06
//define a class
import java.util.Scanner;
public class Root{
    //  add main method
  public static void main(String[ ] args)   {
      //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      System.out.println("Enter a positive double");
      //accepts user input
      if(myScanner.hasNextDouble()){
          double x=myScanner.nextDouble();
          if(x>0){
          double low=0;
          double high=1+x; 
          //double middle=(low+high)/2;
          double middle=(low+high)/2;
          int counter=0;
          int trials=30;
          while(counter<trials){
              middle=(low+high)/2;
              if((middle*middle)>x){
                  high=middle;
              }
              else{
                  low=middle;
              }
              counter++;
          }
          System.out.println("The square root is "+middle);
      }
      else{
          System.out.println("Must enter positive double");
          return;
      }
      }
      else{
          System.out.println("You did not enter a double");
          return; //leaves the program, i.e. the program terminates
      }
  }  //end of main method   
} //end of class