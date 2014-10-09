import java.util.Scanner;
public class Enigma3{
  public static void main(String[ ] args){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          System.out.println("FIRST k value:"+k+" n value:"+n+" OUT Value"+out);
    }
    if((n*k%12)< 12){     //this if statement is true
      n-=20;                
      out+=n;
      System.out.println("SECOND k value:"+k+" n value:"+n+" OUT Value"+out);
    }
    if((n*n)>k){        //this if statement is false after the redefinition of n in the above if statement.
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
       System.out.println("THIRD k value:"+k+" n value:"+n+" OUT Value"+out);
    }
        switch(n+k){
            case 114: 
                        n-=11;
                        k-=3;
                break;
            case 97:
                        n-=14;
                        k-=2;
                break;
            case 98:
                        n/=5;
                        k/=9;       //this line along with line 43 are the sources of the faulty math that leads to the undefined solution to 'out'
            default:
                        n-=3;
                        k-=5;       //the other culprit of the division by zero.
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }//end of main method
} //end of class

//The main problem with this addition program is that the variable 'out' is defined as a string and is therefore
//not interpreted as a number. Therefore, using out+= will not actually add a value to the standing out value, 
//but will instead just add the number onto the end. If out=5 and out+=10, the answer will be 510 instead of 15.
//The other problem with this program is the division by zero. By uisng print statements, I was able to point out 
//where k became 0. On line 40, the operation that occurs is 53/9 which rounds down to the int 5 since k was 
//initialized as an int. This makes the default statement subtract 5 from k which equals 0. Therefore, the final 
//print of variable out (1/n + 1/k), will yield 1/6 + 1/0 which is undefined.