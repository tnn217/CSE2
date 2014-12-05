//Tony Nikolov 
//hw11  MatrixSorter
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
  public static int[][][] buildMat3d(){
      int mat3d[][][]=new int[3][][];
      for(int i=0;i<mat3d.length;i++){
          mat3d[i]=new int[2*i+3][];
          for(int k=0;k<mat3d[i].length;k++){
              mat3d[i][k]=new int[i+k+1];
          }
      }
      for(int x=0;x<mat3d.length;x++){
          for(int y=0;y<mat3d[x].length;y++){
              for(int z=0;z<mat3d[x][y].length;z++){
                  mat3d[x][y][z]=(int)(Math.random()*100)+0;
              }
          }
      }
      return mat3d;
  }
  public static void show(int [][][] mat3d){
      for(int x=0;x<mat3d.length;x++){
          int slab=x+1;
          System.out.println("--------------------------Slab "+slab);
          for(int y=0;y<mat3d[x].length;y++){
              for(int z=0;z<mat3d[x][y].length;z++){
                  System.out.print(mat3d[x][y][z]+" ");
              }
              System.out.println("");
          }
          System.out.println("");
      }
  }
  public static int findMin(int [][][] mat3d){
      int min=mat3d[0][0][0];
      for(int x=0;x<mat3d.length;x++){
          for(int y=0;y<mat3d[x].length;y++){
              for(int z=0;z<mat3d[x][y].length;z++){
                  if(mat3d[x][y][z]<min){
                      min=mat3d[x][y][z];
                  }
              }
          }
      }
      return min;
  }
  public static int[][] sort(int [][] mat2d){
      for(int n=0;n<mat2d.length;n++){   //in order to order the randomized entries in ascending order, I started by creating a loop for every row of the array. We only need to sort within each row, so this initializes the sorting process.
            boolean sort=true;  //first, I established a boolean value as true for the upcoming while loop
            while(sort){    //while sort is true(as defined above), this loop will run indefinitely
                sort=false; //sort is then established as false, so if it isn't re-initialized as true, the loop will end.
                for(int j=0;j<mat2d[n].length-1;j++){  //I decided to sort by comparing every member in the array with the subsequent term in the member array. For this reason, the loop I created only goes until length-1. The second to last term is going to be compared to the last term, so it is unnecessary to factor that in, and a runtime error would happen anyway.
                    if(mat2d[n][j]>mat2d[n][j+1]){    //this if statement is what asks if a member is greater than its subsequent member. If so, it continues through the if statement.
                        int temp=mat2d[n][j];  //a simple switch is enacted between the two members. I used a temporary integer to store the value of one of the members, and ultimately swapped their positions in the member array.
                        mat2d[n][j]=mat2d[n][j+1];
                        mat2d[n][j+1]=temp;
                        sort=true;  //sort is re-initialized as true so the while loop will go again, and test if the next term is greater than the next one.
                    }   //this loop will continue until the if statement is not satisfied. That is, there are no more terms in the array that are greater than their subsequent term. This is what defines an ascending array.
                        
                }
            }
        }
        for(int x=0;x<mat2d.length;x++){
        sort2(mat2d);    
        }
        return mat2d;
  }
  public static int[][] sort2(int [][] mat2d){
            boolean sort=true;  
            while(sort){    
                sort=false; 
                for(int n=0;n<mat2d.length-1;n++){  
                    if(mat2d[n][0]>mat2d[n+1][0]){    
                        int[] temp=mat2d[n];  
                        mat2d[n]=mat2d[n+1];
                        mat2d[n+1]=temp;
                        sort=true;
                        }
                }
            }
      return mat2d;
  }
}
