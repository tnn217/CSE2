import java.util.Scanner;

public class Enigma0{
  public static void main(String[ ] args){
    Scanner myScanner; //must declare instance of scanner object
    System.out.print("Enter an int- ");
    myScanner=new Scanner(System.in); //ready to accept scanner input
    if(myScanner.hasNextInt()){
      int n=myScanner.nextInt();
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
      switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
      }
    }
  }//end of main method
}//end of class

//The main problems with this code were runtime errors, like inappropriately written code in the main method.
//The main logic error involved the misplacement of the switch statement. Since it was outside
//of the if statement containing the scanner instance, the variable n was not initialized.
//I fixed this by putting the switch statement in the if and else statements.
