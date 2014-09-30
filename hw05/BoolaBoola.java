import java.util.Scanner;
//define a class
public class BoolaBoola {
    
// add a main method
public static void main(String[ ] args) {
     //Must declare an instance of the Scanner object
      Scanner myScanner;
      //call the Scanner constructor and construct an instance of the Scanner class
      myScanner = new Scanner( System.in );
    
    //assign random booleans(true or false) to every variable
    boolean randomOne = (Math.random() < 0.5);
    boolean randomTwo = (Math.random() < 0.5);
    boolean randomThree = (Math.random() < 0.5);
    boolean statementOne = (Math.random() < 0.5);
    boolean statementTwo = (Math.random() < 0.5);
    //create if statements to assign && and || values to the boolean statements One and Two right above. Then, nested if statements make sure the input is correct or incorrect
    if (statementOne==true && statementTwo==true){
        System.out.println("Does "+randomOne+" && "+randomTwo+" && "+randomThree+" have the value true(t/T) or false(f/F)?");
        String answer = myScanner.next();
        if (answer.equals("F")||answer.equals("f")&&(randomOne==false||randomTwo==false||randomThree==false)){
            System.out.println("Correct");
        }
        else if (answer.equals("T")||answer.equals("t")&&(randomOne==false||randomTwo==false||randomThree==false)){
            System.out.println("Wrong; Try again");
        }
        else if (answer.equals("T")||answer.equals("t")&&(randomOne==true&&randomTwo==true&&randomThree==true)){
            System.out.println("Correct");
        }
        else if (answer.equals("F")||answer.equals("f")&&(randomOne==true&&randomTwo==true&&randomThree==true)){
            System.out.println("Wrong; Try again");
        }
        else {
            System.out.println("Wrong; Try again");
        }
        
    }
    else if (statementOne==true && statementTwo==false){
        System.out.println("Does "+randomOne+" && "+randomTwo+" || "+randomThree+" have the value true(t/T) or false(f/F)?");
        String answer = myScanner.next();
        if (answer.equals("F")||answer.equals("f")&&((randomOne==false||randomTwo==false)||(randomTwo==false&&randomThree==false))){
            System.out.println("Correct");
        }
        else if (answer.equals("T")||answer.equals("t")&&((randomOne==false||randomTwo==false)||(randomTwo==false&&randomThree==false))){
            System.out.println("Wrong; Try again");
        }
        else if (answer.equals("T")||answer.equals("t")&&(randomOne==true&&randomTwo==true)){
            System.out.println("Correct");
        }
        else if (answer.equals("F")||answer.equals("f")&&(randomOne==true&&randomTwo==true)){
            System.out.println("Wrong; Try again");
        }
        else {
            System.out.println("Wrong; Try again");
        }
    }
    else if (statementOne==false && statementTwo==false){
        System.out.println("Does "+randomOne+" || "+randomTwo+" || "+randomThree+" have the value true(t/T) or false(f/F)?");
        String answer = myScanner.next();
        if (answer.equals("F")||answer.equals("f")&&((randomOne==false&&randomTwo==false)||(randomTwo==false&&randomThree==false))){
            System.out.println("Correct");
        }
        else if (answer.equals("T")||answer.equals("t")&&((randomOne==false&&randomTwo==false)||(randomTwo==false&&randomThree==false))){
            System.out.println("Wrong; Try again");
        }
        else if (answer.equals("T")||answer.equals("t")&&((randomTwo==true)||(randomOne==true&&randomThree==true))){
            System.out.println("Correct");
        }
        else if (answer.equals("F")||answer.equals("f")&&((randomTwo==true)||(randomOne==true&&randomThree==true))){
            System.out.println("Wrong; Try again");
        }
        else {
            System.out.println("Wrong; Try again");
        }
    }
    else if (statementOne==false && statementTwo==true){
        System.out.println("Does "+randomOne+" || "+randomTwo+" && "+randomThree+" have the value true(t/T) or false(f/F)?");
        String answer = myScanner.next();
        if (answer.equals("F")||answer.equals("f")&&((randomTwo==false||randomThree==false)||(randomOne==false&&randomTwo==false))){
            System.out.println("Correct");
        }
        else if (answer.equals("T")||answer.equals("t")&&((randomTwo==false||randomThree==false)||(randomOne==false&&randomTwo==false))){
            System.out.println("Wrong; Try again");
        }
        else if (answer.equals("T")||answer.equals("t")&&((randomTwo==true&&randomThree==true)||(randomOne==true&&randomTwo==true&&randomThree==true))){
            System.out.println("Correct");
        }
        else if (answer.equals("F")||answer.equals("f")&&((randomTwo==true&&randomThree==true)||(randomOne==true&&randomTwo==true&&randomThree==true))){
            System.out.println("Wrong; Try again");
        }
        else {
            System.out.println("Wrong; Try again");
        }
    }
  
    
    
  }  //end of main method   
} //end of class