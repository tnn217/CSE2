import java.util.Scanner;
public class Enigma1{
  public static void main(String[ ] args){
    Scanner myScanner; //must declare instance of scanner object
    double proportion;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    myScanner=new Scanner(System.in);
    double x=myScanner.nextDouble();
    proportion= x/100
   System.out.println("You entered "+x);
   //print out the proportion remaining for select percentages
   if((100-x)/100==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if((100-x)/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if((100-x)/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if((100-x)/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if((100-x)/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   } //end of main method
} //end of class

//The runtime errors were improper notation of the main method and no declaration of the Scanner.
//The logic error involved the calcuation in the if and if else statements.
//The error was in the 1-x part. Since the input was between 1 and 99, it msut be 100-x, rather than its decimal counterpart.
//Also there needs to be parentheses around the 100-x in order for th logic to be applied.
//The remaining percentage out of 1 is only shown for the 5 cases shown in the code(the inputs of 7,41,14,33,and 60)
//The proportion out of 1 for each number entered is calculated. However, there is nothing to prevent the user from entering a negative number or number greater than 100.