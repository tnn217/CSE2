//Tony Nikolov 11/18/14
//HW10
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  public static void showHands(){
      int[] cards=new int[52];    //must first establish an array with 52 entries where each entry represents a card in the deck
      int i=0;
      for(i=0;i<cards.length;i++){  //this for method makes it easy to define every card in the deck as a number from 0-51
          cards[i]=i;
      }
      int[] hand=new int[5];    //must also establish an array for the 5 cards that you draw. The values are initialized as -1 so that when we draw, it works out.
      for(i=0;i<hand.length;i++){
          hand[i]=-1;
      }      
      for(i=0;i<hand.length;i++){   //this for loop establishes the random drawing from the 52 card deck or array and runs it 5 times for the 5 cards in your hand
      Random random=new Random();
      int n=cards[random.nextInt(cards.length)]; //this integer establishes a random number from the deck   
      if(n<0){    //since we switch the values of the deck and the hand, we must establish the fact that if the deck has a value less than 0 which would be -1, then the program rerandomizes the number.
          i--;
          continue;
      }
      hand[i]=n;
      hand[i]=cards[n];
      cards[n]=-1;      //these 3 statements switch the values of the random number chosen from the deck and the -1 value from the hand
      }
      System.out.println(Arrays.toString(hand));    //this shows the printed out value of the hand.
      System.out.print("Clubs: ");    //in order to format the hand appropriately, I used switch statements.
      for(int j=0;j<5;j++){ //for the 5 cases
          if(hand[j]<13){   //in order for a number to be a club, it must be less than 13.
              switch (hand[j]){   //the only cards that are not an actual numbers are the ace, jack, queen, and king, and these are the specific cases. 
                  case 0:
                      System.out.print("A ");
                  case 1:
                      System.out.print("J ");
                  case 11:
                      System.out.print("Q ");
                  case 12:
                      System.out.print("K ");
                  default:
                      System.out.print(hand[j]+" ");  //the default will just print out the number/card value
              }
          }
      }
      System.out.println("");
    System.out.print("Diamonds: ");     //the same applies for diamonds except for the fact that it only applies for the number 13-25 and the default is 13 less than its number value.
    for(int j=0;j<5;j++){ 
          if(hand[j]>=13 && hand[j]<26){
              switch (hand[j]){
                  case 13:
                      System.out.print("A ");
                  case 14:
                      System.out.print("J ");
                  case 24:
                      System.out.print("Q ");
                  case 25:
                      System.out.print("K ");
                  default:
                      System.out.print(hand[j]-13+" ");
              }
          }
      }
      System.out.println("");
    System.out.print("Hearts: "); //applies for 26-38  and the default for the card is 26 less than its number value.
    for(int j=0;j<5;j++){ 
          if(hand[j]>=26 && hand[j]<39){
              switch (hand[j]){
                  case 26:
                      System.out.print("A ");
                  case 27:
                      System.out.print("J ");
                  case 37:
                      System.out.print("Q ");
                  case 38:
                      System.out.print("K ");
                  default:
                      System.out.print(hand[j]-26+" ");
              }
          }
      }
      System.out.println("");
    System.out.print("Spades: "); //39-51 and the default is 39 less than its number value.
    for(int j=0;j<5;j++){ 
          if(hand[j]>=39 && hand[j]<52){
              switch (hand[j]){
                  case 39:
                      System.out.print("A ");
                  case 40:
                      System.out.print("J ");
                  case 50:
                      System.out.print("Q ");
                  case 51:
                      System.out.print("K ");
                  default:
                      System.out.print(hand[j]-39+" ");
              }
          }
      }
      System.out.println("");
  }
  
  
  public static void simulateOdds(){
      int sum=0;    //for the second part of the program, I re-established the deck array, the intial hand array, and the randomizer where the random deck value and the hand value of -1 switch.
      for(int z=0;z<10000;z++){ //repeats the program 10000 times
          int[] cards=new int[52];
          int i=0;
          for(i=0;i<cards.length;i++){
          cards[i]=i;
          }
          int[] hand=new int[5];
          for(i=0;i<hand.length;i++){
            hand[i]=-1;
          }
          for(i=0;i<hand.length;i++){
            Random random=new Random();
            int n=cards[random.nextInt(cards.length)];
            if(n<0){
            i--;
            continue;
            }
            hand[i]=n;
            hand[i]=cards[n];
            cards[n]=-1;
          }
          for(int k=0;k<5;k++){ //for 5 cards, the code below tries to find pairs within the hand. If there is a pair, then that value goes up by one. I didn't have the time to specify all of the specific card pairs, but using a switch statement, I could have split up the pairs amongst the switch statement, and added them up based on that.
              int pair_1=hand[k]; 
              for(int j=0;j<5;j++){
                  if(j==k){
                      continue;
                  }
                 int pair_2=hand[j];
                 if(pair_2%13==pair_1%13){
                    sum++; 
                 }
              }
          }
          
      }
      int pairs=sum/2;
      System.out.println(sum+" "+pairs);
      
  }
}
