import java.util.Scanner;
public class InverseExample{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 integers to be placed into the array.");
        double array[]=new double[10];
        for(int i=0;i<10;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("");
        inverse(array);
    }
    public static void inverse(double array[]){
        double inverse[]=new double[array.length];
        for(int j=0;j<array.length;j++){
            inverse[j]=1/array[j];   //the difference in the code.
        }
        System.out.println("Original  Reversed");
        for(int k=0;k<array.length;k++){
            System.out.println("   "+array[k]+"         "+inverse[k]);
        }
    }
}