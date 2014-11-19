//Tony Nikolov  11/15/14
//Lab11  Arrays
import java.util.Scanner;
import java.util.Arrays;
public class lab11{
    public static void main(String []s){
        Scanner scan;
        scan=new Scanner(System.in);
        System.out.println("Enter 10 integers to be placed into the array");
        int a, b, c, d, e, f, g, h, i, j;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
        e=scan.nextInt();
        f=scan.nextInt();
        g=scan.nextInt();
        h=scan.nextInt();
        i=scan.nextInt();
        j=scan.nextInt();
        int[] scanArray;
        scanArray=new int[] {a,b,c,d,e,f,g,h,i,j};
    
        Arrays.sort(scanArray);
        System.out.println(Arrays.toString(scanArray));
        
        int min=scanArray[0];
        for(int k=1;k<scanArray.length;k++){
            if(scanArray[k]<min){
                min=scanArray[k];
            }
        }
        System.out.println("The lowest entry in the array is "+min);
        
        int max=scanArray[0];
        for(int k=1;k<scanArray.length;k++){
            if(scanArray[k]>max){
                max=scanArray[k];
            }
        }
        System.out.println("The highest entry in the array is "+max);
        
        
    }
}