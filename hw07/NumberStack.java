import java.util.Scanner;
public class NumberStack{
	public static void main(String[] arg){
        Scanner scan;       //Must declare an instance of the Scanner object
        scan=new Scanner(System.in);
        System.out.print("Enter an integer from 1-9: ");
        
        if (!scan.hasNextInt()){     //test if the scanner is an integer
             System.out.println("You did not enter an integer");
             return;
        }
            int number=scan.nextInt();
            int i=0, j=0, k=0, m=0, n=0, o=0, p=0;      //initialize the integers
            System.out.println("Using FOR loops");      //using for loops
            for(i=0;i<number;i++){                      //establish initial loop that dictates how many numbers will print.
                for(k=0;k<i+1;k++){                     //establishes the row counter operation
                    for(m=0;m<(number-i);m++){          //spaces the appropriate amount for each number
                        System.out.print(" ");
                    }
                    for(j=0;j<(i+1)*2-1;j++){           //equation within the for statement establishes the appropriate number of numbers to print.
                            System.out.print(i+1);
                    }
                    
                System.out.println("");                 //skips a line
                }
                for(p=0;p<(number-i);p++){              //establishes the same space rule as the numbers, but this time for the dashes.
                        System.out.print(" ");
                    }
                for(o=0;o<(i+1)*2-1;o++){               //prints the dashes just like the numbers.
                            System.out.print("_");
                    }
                System.out.println("");                 //2 line spaces for formatting purposes.
                System.out.println("");
            }
            System.out.println();
            System.out.println("Using WHILE loops");        //transpose the code above into while format and then do while format. Since all the code will run at least 1 time, there is no difference in the logic used for the do while case.
            i=0;
            while(i<number){
                k=0;
                while(k<i+1){
                    m=0;
                    while(m<(number-i)){
                        System.out.print(" ");
                        m++;
                    }
                    j=0;
                    while(j<(i+1)*2-1){
                        System.out.print(i+1);
                        j++;
                    }
                    k++;
                    System.out.println();
                }
                p=0;
                while(p<(number-i)){
                    System.out.print(" ");
                    p++;
                }
                o=0;
                while(o<(i+1)*2-1){
                    System.out.print("_");
                    o++;
                }
                System.out.println();
                System.out.println();
                
                i++;
            }
            
            System.out.println();
            System.out.println("Using DO WHILE loops");
            i=0;
            do{
             k=0;
             do{
                 m=0;
                 do{
                    System.out.print(" ");
                        m++; 
                 }
                 while(m<(number-i));
                 j=0;
                 do{
                      System.out.print(i+1);
                        j++;
                 }
                 while(j<(i+1)*2-1);
                 k++;
                 System.out.println();
             }
             while(k<i+1);
             p=0;
             do{
                System.out.print(" ");
                    p++; 
             }
             while(p<(number-i));
             o=0;
             do{
                System.out.print("_");
                    o++;             
             }
             while(o<(i+1)*2-1);
             i++;   
            System.out.println();
            System.out.println();
            }
            while(i<number);
       
        
       
	}
}

        
        