//Tony Nikolov
//hw08
//10/27/14
import java.util.Scanner;
public class HW8{
  public static char getInput(Scanner scan, String contin){ //this method is the call for the getInput call on line 88.
      //should force the user to enter a string from the keyboard 
      //that is exactly one character long and that is one of the characters 
      //in the string “dEf”, and it should return the character entered.
      
      //Enter 1 character from the string 'Cc'
      String character = scan.next();   //scan string input from user
      int len = character.length();
      while (len>1){            //establish length counter and make sure the user input is only 1 character.
         System.out.println("Did not enter 1 character Try again: ");
         character=scan.next();
         len = character.length();              //the while statement prompts the user to keep inputting their a string until it is 1 character long.
         }
         char x=character.charAt(0);        //redefine character string as a char.
         while(x!='c' && x!='C' ){          //establish while loop to test if the input is one of 'c' or 'C'.
         System.out.println("Did not enter 'C' or 'c'. Try again: ");
         character=scan.next();
         x=character.charAt(0);             //while statement reprompts user to enter 'C' or 'c' until they finally enter the appropriate char.
         }
         return x; //return the desired output to the method call on line 88.
         
  }
  
  public static char getInput(Scanner scan, String contin,int t){ //this method is the call for the getInput call on line 91.
   //should try to force the user to enter a string that consists of 
   //exactly one character and is one of the characters in the string “abc”, 
   //and it should return the character entered, but it should give up and 
   //return the character ‘ ‘ if the user fails to enter one of the required 
   //characters after 5 attempts.
   t=0; //establish number of tries as 0 initially.
   //Enter 'y', 'Y', 'n', or 'N'
      String character = scan.next();
   int len = character.length();        //same length while statement as previous method
       while(len>1){
           t++;         //for every time the while loop runs, the number of tries increases by 1.
           if(t>4){         //if the number of tries exceeds 4 (equals 5), then the program returns a blank statement and ends the program.
               System.out.println("Wasted all 4 tries");
               char y=' ';
               return y;
           }
           System.out.println("Did not enter 1 character Try again: ");
         character=scan.next();
         len = character.length();
       }
     char x=character.charAt(0);                //very similar input test while statement as the first method, except with different required inputs: 'Y','y','N',or 'n'
     
     while(x!='y' && x!='Y' && x!='n' && x!='N'){
     t++;
     if(t>4){           //program continues try counter as established in previous while statement.
     System.out.println("Wasted all 5 tries");
     char y=' ';
     return y;
     }
     System.out.println("Did not enter 'C' or 'c'. Try again: ");
     character=scan.next();
     x=character.charAt(0);
    }
         return x;      //returns appropriate output to the method call on line 91.
  } 
    
    
   public static char getInput(Scanner scan, String prompt,String contin){      //this method is practically identical to the first method except for the fact that the method on this one calls for 2 strings rather than just 1 and  is the call for the getInput call on line 97. 
       String character = scan.next();
      int len = character.length();
      while (len>1){ //this while statement makes sure the character length is 1.
         System.out.println("Did not enter 1 character Try again: ");
         character=scan.next();
         len = character.length();
         }
         char x=character.charAt(0);
         while(x!='0' && x!='1' && x!='2' && x!='3' && x!='4' && x!='5' && x!='6' && x!='7' && x!='8' && x!='9' ){ //required output is from '0' to '9'.
         System.out.println("Did not enter an acceptable character. Try again: ");
         character=scan.next();
         x=character.charAt(0);
         }
         return x;
   } 
   
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");  //calls the first method.
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //this call overloads the first getInput call, and instead calls the second method because the variables within the call match. 
	//The second call should give up after 5 attempts.
	if(input!=' '){     //since wasting your 5 attempts and returns a blank statement, this line states that if a blank statement wasn't issued, then the output should be printed (below).
   	System.out.println("You entered '"+input+"'");
	}
	System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");  //calls upon the third method and overloads because the variables within the call match.
  }
}
