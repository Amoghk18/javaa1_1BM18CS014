import java.util.*;
class Fibonacci
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter Nth number you want");
    int n=s.nextInt();
    int a=1;
    int b=1;
    int c=0;
    for(int i=0;i<n-1;i++)
    {
     c=a+b;
     a=b;
     b=c;
     c=a;
    }
    System.out.println(c);
  }
}
