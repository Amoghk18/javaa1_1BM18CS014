import java.util.*;
class Matrix
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the rows and colums for first matrix");
    int r1=s.nextInt();
    int c1=s.nextInt();
    int arr1[][]=new int[r1][c1];
    System.out.println("enter the rows and colums for second matrix");
    int r2=s.nextInt();
    int c2=s.nextInt();
    int arr2[][]=new int[r2][c2];
    if(r1!=r2 || c1!=c2)
    System.out.println("addtiion and subtraction cannot be performed");
    else
    {
     System.out.println("enter the elements of matrix1");
     for(int i=0;i<r1;i++)
     { 
       for(int j=0;j<c1;j++)
       {
         arr1[i][j]=s.nextInt();
       }  
        System.out.println();        
     }
    System.out.println("enter the elements of matrix2");
     for(int i=0;i<r2;i++)
     { 
       for(int j=0;j<c2;j++)
       {
        arr2[i][j]=s.nextInt();
       }
       System.out.println();
     }
     System.out.println("The sum of the matrices is");
     for(int i=0;i<r1;i++)
     {
       for(int j=0;j<c1;j++)
       {
         System.out.print(arr1[i][j]+arr2[i][j]);
       }
       System.out.println();
     }
     System.out.println("The difference of the matrices is");
     for(int i=0;i<r1;i++)
     {
       for(int j=0;j<c1;j++)
       {
         System.out.print(arr1[i][j]-arr2[i][j]);
       }
       System.out.println();
     }
   }
  }
}
