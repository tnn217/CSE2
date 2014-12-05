//Tony Nikolov
//Lab 12 ArrayMath 12/3/14
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},   //within the main method, the arrays z,y,z,w,v,u are all defined by hand with various lengths and inputs.
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);   //calls the array addition method below
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));  //this print line calls the display methods for variable x,y,v below. The v display was found after creating the v array from the addArrays method call in the previous line.
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z))); //this print statement pretty much uses the same logic as the print line above, but with different variables in the method calls, and the nested method call for the addition of x and z and ultimately their display.
    System.out.println("It is " + equals(x,y)+" that "+display(x)+  //the 3 print statements below have the exact same concept as the one that I described above except for the call to the booelan equals method that determines whether the two array inputs are equal.
                       " == "+display(y));  
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+  
                       " == "+display(z));

  }
  
  public static String display(double [] x){    //this method call takes a single double array as an input and outputs a String of the contents of the array within brackets.
    String out="{"; //establishes the first bracket
    for(int j=0;j<x.length;j++){    //create a for statement to print out each element of the desired array
      if(j>0){  //we want commas between every element in the array, but obviously not before the first element. This if statement makes sure there is no coma befor ethe first element.
        out+=", ";
          }
          out+=x[j];    //for every loop, the value at that element of the array is placed into the String output.
    }
    return out+"}"; //final bracket to close array string is added.
  }
  
  public static boolean equals(double [] x, double [] y){   //this boolean method interprets the two double arrays as input and returns true if they are the same length and all of the corresponding elements are equal. Otherwise, false is returned.
      if(x.length!=y.length){   //if the length of the two arrays are not equal, then false is printed.
          return false;
      }
      for(int k=0;k<x.length;k++){  //given that the arrays are of the same length, if any element of one array is not equal to the corresponding element in the other array, then the output is false.
          if(x[k]!=y[k]){
              return false;
          }
      }
      return true;  //if neither of these conditions are met, then the arrays must be of same length and equal. Therefore, the output is true.
  }
  public static double[] addArrays(double []x, double []y){ //this method takes 2 double arrays as input and adds them together, then outputs the array. In order to output an array, the code for this line must be for a public static double[].
      if(x.length>y.length){    //in the case that the two arrays are not the same length, specifically the second array is shorter, we need to make them the same length by making any missing terms from the shorter array equal to 0.
          double newy[]=new double[x.length];   //you cannot redefine an array to have a different length, so I had to make a new array for the smaller array to match the length of the larger array.
          for(int m=0;m<y.length;m++){
              newy[m]=y[m]; //for every value of the original small array, we copy it into the new redefined array.
          }
          for(int i=y.length;i<x.length;i++){
              newy[i]=0;    //for the remaining undefined values of the new larger array, we set those equal to zero, which is for the range between the length of the original smaller array and the larger array.
          }
      double result[]=new double[x.length]; //after the smaller array has been readjusted to be the same size as the larger one, I defined the result array.
      for(int j=0;j<x.length;j++){
          result[j]=x[j]+newy[j];   //Finally, I added together the elements of both arrays to construct the respective elements of the result array.
      }
      return result;    //I return the final result array
          
      }
      else if(y.length>x.length){   //this else if case is for when the first array is smaller than the first. The logic of this if statement is the same as the one above, but just for a different case.
          double newx[]=new double[y.length];
          for(int n=0;n<x.length;n++){
              newx[n]=x[n];
          }
          for(int k=x.length;k<y.length;k++){
              x[k]=0;
          }
      double result[]=new double[y.length];
      for(int j=0;j<x.length;j++){
          result[j]=newx[j]+y[j];
      }
      return result;
      }
      
      else{ //in the case that the arrays are already the same size, there needs to be no re-adjusting so I simply just used a for statement to add together the appropriate elements of the two arrays to construct the elements of the result array.
      double result[]=new double[x.length];
      for(int j=0;j<x.length;j++){
          result[j]=x[j]+y[j];
      }
      return result;    //I return the final result array
      }
              
  }
}
