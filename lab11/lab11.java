//Tony Nikolov  11/15/14
//Lab11  Arrays
import java.util.Scanner;
public class lab11{
    public static void main(String []s){
        Scanner scan;
        scan=new Scanner(System.in);    //the scanner is initialized so that the user can enter integers.
        System.out.println("Enter 10 integers to be placed into the array"); //user is prompted
        int a, b, c, d, e, f, g, h, i, j;   //10 integers are established.
        a=scan.nextInt();   //the user is asked to enter 10 integer values which are all stored as various variables
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
        e=scan.nextInt();
        f=scan.nextInt();
        g=scan.nextInt();
        h=scan.nextInt();
        i=scan.nextInt();
        j=scan.nextInt();
        int[] scanArray;    //a new int array is defined as scanArray
        scanArray=new int[] {a,b,c,d,e,f,g,h,i,j};  //the length and contents of the array are then defined as all 10 of the user inputs from above.
        //now that a fully funcitoned user defined array has been established, we can extract some data from it. This segment of the code will find the minimum value in the array.
        int min=scanArray[0];   //before I run my for loop, I established a new variable min as the first entry in the scanArray.
        for(int k=1;k<scanArray.length;k++){
            if(scanArray[k]<min){   //a for loop is created to go through the loop 10 times, as to scan every member of the array. Every member is tested to see if it is smaller than the value of the first entry in the array. If a value is smaller than the first, then it takes its place as the value of min. After running through the loop through every member of the array, the min is established.
                min=scanArray[k];
            }
        }
        System.out.println("The lowest entry in the array is "+min);    //the result of the for loop is shown in this print statement is p
        
        int max=scanArray[0];   //this  segment is really no different than the minimum calculation, except for one minor adjustment.
        for(int k=1;k<scanArray.length;k++){
            if(scanArray[k]>max){   //rather than test to see if every array member is less than the first member, we test to see if they are larger. This in the end will give us the largest member of the array.
                max=scanArray[k];
            }
        }
        System.out.println("The highest entry in the array is "+max);
        
        int sum=0; //now we want to find the sum of all of the members of the array. The sum is iniatalized as 0.
        for(int l=0;l<scanArray.length;l++){ //a for loop runs through every member of the array.
            sum+=scanArray[l];  //this adds a member of the array to sum. After the loop completes, then sum will provide the actual sum of all elements of the array.
        }
        System.out.println("The sum is "+sum);
        
        int inverse[]=new int[scanArray.length]; //this segment of the code defines a new array, inverse which is the same length as the original and accordingly makes it the inverse of the original array.
        for(int m=0;m<scanArray.length;m++){    //a for loop is created so taht it loops for every membe rof the array.
            inverse[m]=scanArray[9-m];  //this logic makes it such that the first member of the inverse array is the last member of the original, second is to the second to last, etc.
        }
        
        for(int n=0;n<scanArray.length;n++){    //this for statement allows for a specificied format to the printing of both arrays.
            System.out.println(scanArray[n]+"   "+inverse[n]);  //I was asked to print the contents of both arrays vertically, side by side.
        }
        
    }
}