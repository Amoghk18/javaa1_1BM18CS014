import java.util.*;
class Fibonaccifunc
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter Nth number you want");
    int n=s.nextInt();
    fibo(n);
  }

 static void fibo(int m)
{
    int a=1;
    int b=1;
    int c=0;
    for(int i=0;i<m-1;i++)
    {
     c=a+b;
     a=b;
     b=c;
     c=a;
    }
    System.out.println(c);
}
}
