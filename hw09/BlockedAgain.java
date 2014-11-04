//Tony Nikolov   11/4/14 
//HW09  BlockedAgain.java
import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); //calls the getInt method below- conducts part A of the code.
        allBlocks(m);    //calls the allBlocks method- conducts part B of the code.
    }
    public static int getInt(){   //this is the method call for line 8 above
        Scanner scan;       //Must declare an instance of the Scanner object
        scan=new Scanner(System.in);
        System.out.print("Enter an integer from 1-9 (inclusive): "); //prompt user for input.
        int n=checkInt(scan);       //this line calls the checkInt method that tests if the input is actually an integer
        int o=checkRange(n,scan);   //this line calls the checkRange method that tests if the integer is within the range of 1 and 9(inclusive)
        //System.out.println("output is"+o);  used this line as a test.
        return o; //return the output of  getInt
    
    }
    public static int checkInt(Scanner scan){       //this method gets the call to test the integer
        while(!scan.hasNextInt()){          //while statement keeps re-prompting the user to enter an integer, until they finally do.
            System.out.println("Did not enter an integer. Try again: ");
            scan.next();
        }
        int number=scan.nextInt();      //after an integer is entered, it is established as an int variable.
        //System.out.println("checkInt check"+number);   used this step as a checkpoint
        return number;          //the int variable is returned to the original call.
    }
    public static int checkRange(int n,Scanner scan){       //this method tests the range of the input
        while(n<0 || n>9){  //if the input is not within the range of 1-9, then it runs through this while statement.
            System.out.println("Must enter an integer between 1-9. Try again: ");
            while(!scan.hasNextInt()){                                              //user is forced to re-enter an integer, however if they don't enter an integer then they are given an error and a re-prompt within the 'range' while loop.
                System.out.println("Did not enter an integer. Try again: ");
                scan.next();
            }
            n=scan.nextInt();       //finally when the user enters an integer within the range of 1-9,the input is established by an int variable
        }
        return n;   //input is returned to the method call
    }           //end of Problem A ....Start of Problem B
    public static int allBlocks(int number){    //within the allBlocks call, the code for the number stack is placed and whatever the output is, that will be printed by the allBlocks method.
        int i=0, j=0, k=0, m=0, n=0, o=0, p=0;      //initialize the integers
            
            for(i=0;i<number;i++){                      //establish initial loop that dictates how many numbers will print.
                for(k=0;k<i+1;k++){                     //establishes the row counter operation
                    for(m=0;m<(number-i);m++){          //spaces the appropriate amount for each number
                        System.out.print(" ");
                    }
                    for(j=0;j<(i+1)*2-1;j++){           //equation within the for statement establishes the appropriate number of numbers to print.
                            System.out.print(i+1);
                    }
                    
                System.out.println("");                 //skips a line
                }
                for(p=0;p<(number-i);p++){              //establishes the same space rule as the numbers, but this time for the dashes.
                        System.out.print(" ");
                    }
                for(o=0;o<(i+1)*2-1;o++){               //prints the dashes just like the numbers.
                            System.out.print("_");
                    }
                System.out.println("");                 //2 line spaces for formatting purposes.
                System.out.println("");
            }
            return number; //returns number
    }
}
