//Tony Nikolov
//Lab 13 RaggedArrays
public class lab13{
    public static void main(String [] arg){
        int ragged[][]=new int[5][];    //first must establish the ragged array. There are 5 rows in the array and a different amount of array members for each row.
        for(int i=0;i<ragged.length;i++){   //to allocate the correct amount of member arrays for a specific row, I used a for loop to cycle through each row and used an equation that gives the amount of members.
            ragged[i]=new int[3*i+5];   //3i+5 gives us the pattern: 5,8,11,14,etc.
        }
        for(int j=0;j<ragged.length;j++){   //this nested for loop creates a random value for each member of the ragged array. The outside for loop cycles through the 5 rows of the array.
            for(int k=0;k<ragged[j].length;k++){    //the inside for loop continues for as many times as the length of that specific row, as defined in the for loop above.
                ragged[j][k]=(int)(Math.random()*40)+0; //this assigns a random value for the specific member of the array that is being dealt with.
                System.out.print(ragged[j][k]+" "); //after a random value is given, it is then printed out with appropriate formatting
            }
            System.out.println(""); //after every member of a row is complete, this line goes to the next line to start randomizing and printing the next set of members within the next row.
        }
        System.out.println("");
        System.out.println("Sorted in Ascending Order");
        for(int n=0;n<ragged.length;n++){   //in order to order the randomized entries in ascending order, I started by creating a loop for every row of the array. We only need to sort within each row, so this initializes the sorting process.
            boolean sort=true;  //first, I established a boolean value as true for the upcoming while loop
            while(sort){    //while sort is true(as defined above), this loop will run indefinitely
                sort=false; //sort is then established as false, so if it isn't re-initialized as true, the loop will end.
                for(int j=0;j<ragged[n].length-1;j++){  //I decided to sort by comparing every member in the array with the subsequent term in the member array. For this reason, the loop I created only goes until length-1. The second to last term is going to be compared to the last term, so it is unnecessary to factor that in, and a runtime error would happen anyway.
                    if(ragged[n][j]>ragged[n][j+1]){    //this if statement is what asks if a member is greater than its subsequent member. If so, it continues through the if statement.
                        int temp=ragged[n][j];  //a simple switch is enacted between the two members. I used a temporary integer to store the value of one of the members, and ultimately swapped their positions in the member array.
                        ragged[n][j]=ragged[n][j+1];
                        ragged[n][j+1]=temp;
                        sort=true;  //sort is re-initialized as true so the while loop will go again, and test if the next term is greater than the next one.
                    }   //this loop will continue until the if statement is not satisfied. That is, there are no more terms in the array that are greater than their subsequent term. This is what defines an ascending array.
                        
                }
            }
        }
        for(int j=0;j<ragged.length;j++){   //just like when printing the random ragged array, I did it again, but this time with the newly sorted array.
            for(int k=0;k<ragged[j].length;k++){
                System.out.print(ragged[j][k]+" ");
            }
            System.out.println("");
        }
            
    }
}