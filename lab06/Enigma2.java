import java.util.Scanner;
public class Enigma2{
  public static void main(String[ ] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  } //end of main method
} //end of class

//The runtime error in this program involves the case 40, where the string 'out' is being increased by an increment
//of 40/0 which is, of course, undefined. This error is noted by the compiler.
//When compiled, the runtime error says: "Exception in thread 'main' java.lang.ArithmeticException: / by zero"