//////////////////////////////
//Tony Nikolov
//09/25/14
//lab05
//Write a program that uses the Scanner class to obtain from the user
//one of three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
//card from a deck of playing cards. The user should enter one of the Strings “R” , “r”,
//“C”, “c”, “P”, “p”. If the string is not of length one, an error message should be
//displayed. If the string has any other character than ‘R’, ‘r’, ‘C’, ‘c’, ‘P’, or ‘p’ an error
//message should be displayed. If the user enters “R” or “r” then the program will print
//the results of a play at Roulette, one of the numbers 0, 00, 1, 2, …, 36 (the roulette
//wheel has 18 red numbers, 1, 3, …, 35, 18 black numbers, 2,4,...,36, and a blue 0
//and a blue 00). If the user enters “C” or “c”, then the program should display the
//random outcome of two rolls of a die (each roll in the range 1, 2, …, 6). If the user
//enters “P” or “p”, then the program should display a random draw from a deck of
//cards. Notice the use of “should” in the previous two sentences. For this
//assignment, the Craps and Picking options need not be implemented. If you don’t
//implement the option, the program should display a message to the effect that the
//option has yet to be implemented.
import java.util.Scanner;
//  define a class
public class RandomGames {
    
//  add main method
  public static void main(String[ ] args)   {
       //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
      //Ready to accept input. User is prompted for letter denoting proper card game.
      System.out.print(
        "Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
        String game = myScanner.next();
         
        //if the user inputs R or r, then it runs the roulette branch of the program.
        if (game.equals("R")){
            //use random number function to assign the outcome of roulette. 39 indicates 00.
            int suit=(int)(Math.random()*39)+0;
            if (suit==39){
                System.out.println("Roulette: 00");
            }
            else{
                System.out.println("Roulette: "+suit);
            }
            
        }
        else if (game.equals("r")){
            //use random number function to assign the outcome of roulette. 39 indicates 00.
            int suit=(int)(Math.random()*39)+0;
            if (suit==39){
                System.out.println("Roulette: 00");
            }
            else{
                System.out.println("Roulette: "+suit);
            }
        }
        
        //if the user inputs C or c, then it runs the craps branch of the program.
        else if (game.equals("C")){
            int firstRoll=(int)(Math.random()*6)+1; //assign random number generator from 1-6 for both rolls of the dice.
            int secondRoll=(int)(Math.random()*6)+1;
            int totalRoll=firstRoll+secondRoll; //adding together the rolls, as per the rules of Craps.
            System.out.println(firstRoll+"+"+secondRoll+"="+totalRoll);
        }
         else if (game.equals("c")){
            int firstRoll=(int)(Math.random()*6)+1; //same process as input of C.
            int secondRoll=(int)(Math.random()*6)+1;
            int totalRoll=firstRoll+secondRoll;
            System.out.println(firstRoll+"+"+secondRoll+"="+totalRoll);
        }
        
        //if P or p is written, then the pick a card branch is selected.
        else if (game.equals("P")){
            //randomly assign a number to denote the suit (1-4)
            int suit=(int)(Math.random()*4)+1;
            String suitString;
                switch (suit){     //use switch statement to assign random variable to an appropriate case
                    case 1:  suitString = "Clubs";
                    break;
                    
                    case 2: suitString = "Spades";
                    break;
                    
                    case 3: suitString = "Hearts";
                    break;
                    
                    case 4: suitString = "Diamonds";
                    break;
                }
                
                int card=(int)(Math.random()*13)+1;
                String cardString;
                    switch (card){
                        case 1:  cardString = "Ace";
                        break;
                        
                        case 2:  cardString = "2";
                        break;
                        
                        case 3:  cardString = "3";
                        break;
                        
                        case 4:  cardString = "4";
                        break;
                        
                        case 5:  cardString = "5";
                        break;
                        
                        case 6:  cardString = "6";
                        break;
                        
                        case 7:  cardString = "7";
                        break;
                        
                        case 8:  cardString = "8";
                        break;
                        
                        case 9:  cardString = "9";
                        break;
                        
                        case 10:  cardString = "10";
                        break;
                        
                        case 11:  cardString = "Jack";
                        break;
                        
                        case 12:  cardString = "Queen";
                        break;
                        
                        case 13:  cardString = "King";
                        break;
                    }
                
        }
        
        else if (game.equals("p")){
            int suit=(int)(Math.random()*4)+1;
            String suitString;
                switch (suit){     //use switch statement to assign random variable to an appropriate case
                    case 1:  suitString = "Clubs";
                    break;
                    
                    case 2: suitString = "Spades";
                    break;
                    
                    case 3: suitString = "Hearts";
                    break;
                    
                    case 4: suitString = "Diamonds";
                    break;
                }
                
                int card=(int)(Math.random()*13)+1;
                String cardString;
                    switch (card){
                        case 1:  cardString = "Ace";
                        break;
                        
                        case 2:  cardString = "2";
                        break;
                        
                        case 3:  cardString = "3";
                        break;
                        
                        case 4:  cardString = "4";
                        break;
                        
                        case 5:  cardString = "5";
                        break;
                        
                        case 6:  cardString = "6";
                        break;
                        
                        case 7:  cardString = "7";
                        break;
                        
                        case 8:  cardString = "8";
                        break;
                        
                        case 9:  cardString = "9";
                        break;
                        
                        case 10:  cardString = "10";
                        break;
                        
                        case 11:  cardString = "Jack";
                        break;
                        
                        case 12:  cardString = "Queen";
                        break;
                        
                        case 13:  cardString = "King";
                        break;
                    }
                System.out.println("Picking card not implemented yet");
                //System.out.println(cardString+"of"+suitString); //print out result of randomization and assigning of proper names.
        }
        
        //if anything else is entered, then there is an error message.
        else if (game.length()>1)  {
            System.out.println("A single character is expected");
            return; //leaves the program, i.e. the program terminates
        }
        else {
            System.out.println(game.charAt(0)+" is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
            return;
        }
        
  }  //end of main method   
} //end of class