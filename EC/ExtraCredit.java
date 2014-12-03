//Tony Nikolov
//Extra Credit Assignment
import java.util.Scanner;
public class ExtraCredit{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 integers to be placed into the array.");
        int array[]=new int[10];
        for(int i=0;i<10;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("");
        reverse(array);
    }
    public static void reverse(int array[]){
        int reverse[]=new int[array.length];
        for(int j=0;j<array.length;j++){
            reverse[j]=array[(array.length-1)-j];
        }
        System.out.println("Original  Reversed");
        for(int k=0;k<array.length;k++){
            System.out.println("   "+array[k]+"         "+reverse[k]);
        }
    }
}