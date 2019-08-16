import java.util.*;
class Sort
{ 
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of elements in the array");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<n;i++)
    arr[i]=s.nextInt();
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
     {
        if(arr[j]>arr[j+1])
      { 
        int t=arr[j+1];
        arr[j+1]=arr[j];
        arr[j]=t;
      }
     }
    }
    System.out.println("the sorted array is");
    for(int i=0;i<n;i++)
    System.out.print(arr[i]+" ");
  }
}
