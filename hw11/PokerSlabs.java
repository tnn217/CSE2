//Tony Nikolov
//hw11 PokerSlabs
import java.util.Scanner;
public class PokerSlabs{
    public static void main(String arg[]){
        int hand[]=new int[5];
        int frequency[]=new int[13];
        getHand(hand, frequency);
        printhand(hand);
    }
    public static void getHand(int hand[], int frequency[]){
        int suit=0;
        int rank=0;
        int card=0;
        for(int i=0;i<hand.length;i++){
            suit=getSuit();
            rank=getRank();
            //frequency[rank]++;
            card=suit*13+rank;
            hand[i]=card;
        }
    }
    public static int getSuit(){
        Scanner scan=new Scanner(System.in);
        int c=0;
        int d=1;
        int h=2;
        int s=3;
        System.out.println("Enter the suit: 'c', 'd', 'h', or 's'");
        while(true){
            String input=scan.next();
            if(input.length()>1){
                System.out.println("Did not enter a valid answer. Try again.");
                continue;
            }
            char suit=input.charAt(0);
            if(suit=='c'){
                return c;
            }
            else if(suit=='d'){
                return d;
            }
            else if(suit=='h'){
                return h;
            }
            else if(suit=='s'){
                return s;
            }
            else{
                System.out.println("Did not enter one of those suits. Try again:");
            }
        
        }
    }
    public static int getRank(){
        Scanner scan=new Scanner(System.in);
        int a=0;
        int k=1;
        int j=11;
        int q=12;
        System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
        int output=0;       
        while(true){
            if(scan.hasNextInt()){
              output=scan.nextInt();
              if(output>1&&output<11){
                  return output;
              }
              else{
                  System.out.println("Must be between 2 and 10 inclusive");
                  continue;
              }
            }
            else{
                String input=scan.next();
                if(input.length()>1){
                    System.out.println("Did not enter a valid answer. Try again.");
                    continue;
                }
                char rank=input.charAt(0);
                if(rank=='a'){
                    return a;
                }
                else if(rank=='k'){
                    return k;
                }
               else if(rank=='q'){
                    return q;
                }
                else if(rank=='j'){
                    return j;
                }
               
                else{
                    System.out.println("Did not enter one of those ranks. Try again:");
                }
            }
        
        }
    }
    public static void printhand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",  "Spades:   "};
    	String face[]={
           "K ","A ","2 ","3 ","4 ","5 ","6 ","7 ",
      	"8 ","9 ","10 ","J ","Q "};
    	String out="";
    	for(int s=0;s<4;s++){
      	out+=suit[s];
      	for(int rank=0;rank<13;rank++){
        	for(int card=0;card<5;card++){
         	if(hand[card]/13==s && hand[card]%13==rank){
          	out+=face[rank];
      	out+='\n';
         	}
        	}
      	}
    	}
    	System.out.println(out);
  }


}