import java.util.Scanner;
public class MoreLoops{
	public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0; //n is initially established as 0

   System.out.print("Enter an int- ");
   if (!scan.hasNextInt()){
    do{	
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    } while(!scan.hasNextInt());
   }
   
       /*System.out.print("Enter an int- ");
    while(!scan.hasNextInt()){
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    }*/
    
    
    //The above 5 lines of code prompt the user to enter an int. If they do not enter an int, they are prompted to try again.
    //With a Do-While Loop, the program does whatever happens in the do statement given the while statement is true.
    	n=scan.nextInt();
    
    int j=0;    //j is initially valued at 0
    while(j<n && j<40){     //while loop established until j=n
    
    int k=0;    //j is initially valued at 0
        while(k<j+1){   //nested while loop is established until k=j+1
            System.out.print('*');  //star is printed for every loop.
            k++;
        }
    System.out.println();  //when the nested loop is completed, this print statement tabs to the next line.
    j++;
    }
    
    /*for(int j=0;j<n && j<40;j++){
    	for(int k=0;k<j+1;k++){
   	 System.out.print('*');
    	}
    	System.out.println();
    }*/
    
    
    //I changed all of the for statements with while statements, which involved changing the location of the increment statements (variable++;)
    //to the end of each while statement.
 	 
    int k=4;

    while(k<4){
    	k++;
    }
    System.out.println("k="+k);
     	
     	/*do{
    	System.out.println("k="+k);
    	k++;
    }
     	while(k<4);*/
    	
    	//The do-while loop is changed to a while loop, despite it never actually needed to be run since k is previously defined as 4.
        //and the while loop is established for k<4. The value of 4 is then printed.
    	
    	for(int count=0;count<11;count++){  //for statement establishes count variable and count counter as well as a maximum count value so the program does not loop forever.
    	    if (n==1 || n==2){                  //the switch statement from before has been converted into many if, else if, and else statements. The program is longer and more difficult to read.
    	        System.out.print("Case 2 ");
    	    }
    	    else if (n==3){
    	        break;
    	    }
    	    else if (n==4){
    	        System.out.println("Case 4");
    	        System.out.println("Case 5");
    	    }
    	    else if (n==5){
    	        System.out.println("Case 5");
    	    }
    	    else{
    	        System.out.println(n + " is > 5 or <1");
    	        break;
    	    }
    	    
    	    if (count>10){      //if the count is above 10, then it will break.
    	        break;
    	    }
    	}
    	
    	
    /*while(true){
    	switch(n){
    	default: System.out.println(n + " is > 5 or <1");
   	 break;
    	case 1:
    	case 2: System.out.print("Case 2 ");
   	 continue;
    	case 3: break;
    	case 4: System.out.println("Case 4");
    	case 5: System.out.println("Case 5");
   	 break;
    	}
    	count++;
    	if(count>10)
   	 break;
    }*/
    
    //I changed the while and switch statements to for and if/else if/else statements. This actually corrected the problem with case 2 where it looped endlessly.
	}
}