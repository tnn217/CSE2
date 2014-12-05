//Tony Nikolov 
//Methods Lab 09
import java.util.Scanner;
public class Methods{
  
    
 public static int getInt(Scanner scan){ //this is the scanner method that is called from the main method 3 consecutive times.
     System.out.println("Enter an int"); //user is prompted to enter an integer.
     
     
     while(!scan.hasNextInt()){ //if the user does not enter an integer, then they are prompted to try again until they finally enter an int.
         System.out.println("Did not enter an int. Try again: ");
         //return;
         scan.next();
     }
     int numscan=scan.nextInt(); //when they finally enter an int, it is recorded as the variable numscan
     return numscan; //numscan is returned as the result. Since we run through this method 3 times, there are 3 established scans.
 }
 public static int larger(int a,int b){ //this method considers two integers as input and based on logic, decides which one is the larger integer.
      if(a>b){ //the logic here is fairly straight forward. If the first integer is larger than the second, then the first integer will be returned as being larger.
          return a;
      }
      else { // the other scenario is that b will be larger, and in that case, b wil be returned.
          return b;
      }
 }
 public static boolean ascending(int a, int b, int c){ //as described in the main method below, this method takes 3 integers as input and checks to see if they are in increasing order. If they are, then this boolean method call outputs true, otherwise false.
     if(c>b && b>a){ //if these numbers were to be in ascending order, then a must be the smallest integer, followed by b, with c being the largest. That is what this logic says.
         return true;
     }
     else{ //if the above conditions are not true, then they must not be in ascending order which warrants a false output.
         return false;
     }
 }

  public static void main(String [] arg){ //main method which calls other methods.
	Scanner scan=new Scanner(System.in); //initialized the scanner
	int a,b,c; //establish 3 new ints.
	System.out.println("Enter three ints"); //user is prompted to enter 3 ints. 
	a=getInt(scan); //the next 3 lines are method calls to the scanner method.
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b)); //after the 3 scans are established from the getInt scanner method, a print statement outputs the results of the getInt method, but also calls the method: larger.
	System.out.println("The larger of "+a+", "+b+", and "+c+ //this second print statement is really no different than the one above except for the fact that all 3 scanner method outputs are used and a nested method call for the larger method is used.
                   	" is "+larger(a,larger(b,c))); //this means that the inner method of b and c will be conducted first, and then whichever one is larger will go through the method again but this time with a. This is an effective way to find the largest of 3 integers.
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+ //this print statement calls a new method, ascending, which checks to see if the numbers entered are in ascending order. If true, then boolean true is outputted, and if false then boolean false is outputted.
                   	", and "+c+" are in ascending order");
  }

    
}
