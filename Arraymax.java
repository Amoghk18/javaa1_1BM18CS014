import java.util.*;
class Arraymax
{ 
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter rows and columns");
    int r=s.nextInt();
    int c=s.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("enter the elements of the array");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
       {
       arr[i][j]=s.nextInt();
       }
    } 
    int max=-1;
    for (int a[]:arr)
    {
      for(int x:a)
      {
        if(x>max)
        max=x; 
      } 
    }
    System.out.println("the maximum element is"+max);
  }
}
