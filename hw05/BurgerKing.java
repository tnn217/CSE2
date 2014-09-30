//////////////////////////////
//Tony Nikolov
//09/29/14
//hw05
//BurgerKing
//Now Burger King gets its chance. Write a program that prompts the user 
//to enter a choice of a burger, a soda, or fries. Then the program prompts 
//the users for details of their choices

import java.util.Scanner;
//define a class
public class BurgerKing {
    
// add a main method
  public static void main(String[ ] args)   {
      //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User is prompted for letter denoting proper food item.
      System.out.print(
        "Enter Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), Fries (F or f)");
        String food = myScanner.next();
        
        //if the user inputs B or b, then a burger is selected and that subsection of the program runs
        if (food.equals("B")){
            System.out.print(
            "Enter A or a for 'all the fixins', C or c for cheese, N or n for none of the above");
            String fixins = myScanner.next();
            if (fixins.equals("A")){
                System.out.println("You ordered a burger with all the fixins");
            }
            else if (fixins.equals("a")){
                System.out.println("You ordered a burger with all the fixins");
            }
            else if (fixins.equals("C")){
                System.out.println("You ordered a burger with cheese");
            }
            else if (fixins.equals("c")){
                System.out.println("You ordered a burger with cheese");
            }
            else if (fixins.equals("N")){
                System.out.println("You ordered a plain burger");
            }
            else if (fixins.equals("n")){
                System.out.println("You ordered a plain burger");
            }
        }
        else if (food.equals("b")){
            System.out.print(
            "Enter A or a for 'all the fixins', C or c for cheese, N or n for none of the above");
            String fixins = myScanner.next();
            if (fixins.equals("A")){
                System.out.println("You ordered a burger with all the fixins");
            }
            else if (fixins.equals("a")){
                System.out.println("You ordered a burger with all the fixins");
            }
            else if (fixins.equals("C")){
                System.out.println("You ordered a burger with cheese");
            }
            else if (fixins.equals("c")){
                System.out.println("You ordered a burger with cheese");
            }
            else if (fixins.equals("N")){
                System.out.println("You ordered a plain burger");
            }
            else if (fixins.equals("n")){
                System.out.println("You ordered a plain burger");
            }
        }
        
        //if the user inputs an S or s, then the subsection of the program about sodas starts.
        else if (food.equals("S")){
            System.out.print(
            "Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m) ");
            String soda = myScanner.next();
            if (soda.equals("P")){
                System.out.println("You ordered a Pepsi");
            }
            else if (soda.equals("p")){
                System.out.println("You ordered a Pepsi");
            }
            else if (soda.equals("C")){
                System.out.println("You ordered a Coke");
            }
            else if (soda.equals("c")){
                System.out.println("You ordered a Coke");
            }
            else if (soda.equals("S")){
                System.out.println("You ordered a Sprite");
            }
            else if (soda.equals("s")){
                System.out.println("You ordered a Sprite");
            }
            else if (soda.equals("M")){
                System.out.println("You ordered a Mountain Dew");
            }
            else if (soda.equals("m")){
                System.out.println("You ordered a Mountain Dew");
            }
        }
        else if (food.equals("s")){
            System.out.print(
            "Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m) ");
            String soda = myScanner.next();
            if (soda.equals("P")){
                System.out.println("You ordered a Pepsi");
            }
            else if (soda.equals("p")){
                System.out.println("You ordered a Pepsi");
            }
            else if (soda.equals("C")){
                System.out.println("You ordered a Coke");
            }
            else if (soda.equals("c")){
                System.out.println("You ordered a Coke");
            }
            else if (soda.equals("S")){
                System.out.println("You ordered a Sprite");
            }
            else if (soda.equals("s")){
                System.out.println("You ordered a Sprite");
            }
            else if (soda.equals("M")){
                System.out.println("You ordered a Mountain Dew");
            }
            else if (soda.equals("m")){
                System.out.println("You ordered a Mountain Dew");
            }
        }
        
        //if the user inputs an F or f, then the subsection of the program about fries starts.
        else if (food.equals("F")){
            System.out.print(
            "Do you want a large or small order of fries (l,L,s, or S) ");
            String fries = myScanner.next();
            if (fries.equals("L")){
                System.out.println("You ordered large fries");
            }
            else if (fries.equals("l")){
                System.out.println("You ordered large fries");
            }
            else if (fries.equals("S")){
                System.out.println("You ordered small fries");
            }
            else if (fries.equals("s")){
                System.out.println("You ordered small fries");
            }
        }    
        else if (food.equals("f")){
            System.out.print(
            "Do you want a large or small order of fries (l,L,s, or S) ");
            String fries = myScanner.next();
            if (fries.equals("L")){
                System.out.println("You ordered large fries");
            }
            else if (fries.equals("l")){
                System.out.println("You ordered large fries");
            }
            else if (fries.equals("S")){
                System.out.println("You ordered small fries");
            }
            else if (fries.equals("s")){
                System.out.println("You ordered small fries");
            }
        }
        
            
       //if anything greater than 1 character is entered, then there is an error message.
        else if (food.length()>1)  {
            System.out.println("A single character is expected");
            return; //leaves the program, i.e. the program terminates
        }
        else { //the final else statement says that since the only other possibility for an input is an incorrect 1 character input, an appropriate error statement is printed.
            System.out.println(food.charAt(0)+" is not one of 'B', 'b', 'S', 's', 'F', or 'f'");
            return;
        }
 
  }  //end of main method   
} //end of class