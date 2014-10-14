//////////////////////////////
//Tony Nikolov
//10/14/14
//hw06
//define a class
public class Roulette{
    //  add main method
  public static void main(String[ ] args)   {
      int simCounter=0;
      int simTrials=1000;       //establish simulation counter and trial variables for the repetition of the following gambling game 1000 times.
      
      int winMoney=0;
      int noWins=0;
      int totalWins=0;
      //number of times the gambler wins money, gets no money back, and total Wins are established at 0 initially.
      
      while(simCounter<simTrials){      //the 1000 trials of the game is established by this while loop and the 'simCounter++;' statement at the bottom.
      
          int randChoice=(int)(Math.random()*38)+0;     //the random variable that the gambler chooses is initially established and used for all 100 trials
          //random choice established
          
          int counter=0;    
          int trials=100;   //establish counter and trial variables for the loop
          int wins=0;
          
          while(counter<trials){        //loop the game to go 100 times by incrementing counter by +1 until it hits the maximum of 100 and stops.
              int randRoll=(int)(Math.random()*38)+0;   //this variable defines the result of the roulette spin.
              if (randRoll==randChoice){    //if the initial choice is equal to the roulette roll, then the gambler wins that round.
                  wins++;       //for every win, the wins variable increases by 1.
                  totalWins++;
                  //you win
              }
              counter++;
          }
          
          if (wins>=3){     //if the gambler wins 3 times out of 100, then he makes money. This if statement finds when the gambler wins money.
              //you make money
              winMoney+=1;  //for every time the gambler wins money, his winMoney variable increases by 1
          }
          
          if (wins==0){
              noWins+=1;
          }
          simCounter++;
      }
      int moneyWon=(int)(totalWins*36);
      System.out.println("You won $"+moneyWon+" given the fact that $100,000 were put in");
      System.out.println("You lost everything "+noWins+" times");
      System.out.println("You made a profit "+winMoney+" times");
      
      
      
 }  //end of main method   
} //end of class