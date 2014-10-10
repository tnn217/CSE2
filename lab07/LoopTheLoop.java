import java.util.Scanner;
//define a class
public class LoopTheLoop {

//add main method
    public static void main(String[ ] args) {
        
        while(true){    //establish true statement that will loop the program given appropriate input
        Scanner trueScanner;
        
        
        
        Scanner myScanner;
        //call the Scanner constructor and construct an instance of the Scanner class
        myScanner = new Scanner( System.in );
            //Ready to accept input.
       
        System.out.println("Enter an int between 1 and 15- ");
        if (myScanner.hasNextInt()){
            int nStars = myScanner.nextInt();
                while (nStars<1 || nStars>15) {
                    System.out.println("Did not enter an int between 1 and 15- ");
                    myScanner = new Scanner( System.in );
                    //Ready to accept input.
                    System.out.println("Enter an int between 1 and 15- ");
                    nStars = myScanner.nextInt();
                }
        
        
        
        
            
            int domain = 0;
            while (nStars>domain) {      //Loop is designed to print out nStars. When nStars>0 the loop runs, and it counts down in increments of 1 for every run through of the loop.
                System.out.print("*"); 
                domain++;
            }
            
            domain = 0;
            String stars = "";
            while (nStars>=domain){
                System.out.println(stars);
                stars += "*";
                domain++;
            }
        
            
        }
        
        else if (!myScanner.hasNextInt()) {
            myScanner = new Scanner( System.in );
                    //Ready to accept input.
                    System.out.println("Enter an int between 1 and 15- ");
                    int nStars = myScanner.nextInt();
                     int domain = 0;
            
                    while (nStars>domain) {      //Loop is designed to print out nStars. When nStars>0 the loop runs, and it counts down in increments of 1 for every run through of the loop.
                        System.out.print("*"); 
                        domain++;
                    }
                    
                    domain = 0;
                    String stars = "";
                    while (nStars>=domain){
                        System.out.println(stars);
                        stars += "*";
                        domain++;
                    }
        }
        
            
       
      trueScanner = new Scanner( System.in );
      System.out.println("Enter y or Y to go again");
      String rerun = trueScanner.next();
      if (rerun.equals("y")){
         //no conditions needed for y or Y since, the program will loop if those are entered. 
      }
      else if (rerun.equals("Y")){
          
      }
      else{
          break; //if anything besides y or Y are entered, then the program will break.
      }
      
      
      
        }//end of huge loop
        
    } //end of main method
} //end of class