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
      System.out.println(Arrays.toString(hand));
      System.out.print("Clubs: ");
      for(int j=0;j<5;j++){ 
          if(hand[j]<13){
              switch (hand[j]){
                  case 0:
                      System.out.print("A ");
                  case 1:
                      System.out.print("J ");
                  case 11:
                      System.out.print("Q ");
                  case 12:
                      System.out.print("K ");
                  default:
                      System.out.print(hand[j]+" ");
              }
          }
      }
      System.out.println("");
    System.out.print("Diamonds: ");
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
    System.out.print("Hearts: ");
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
    System.out.print("Spades: ");
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
      int sum=0;
      for(int z=0;z<10000;z++){
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
          for(int k=0;k<5;k++){
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
