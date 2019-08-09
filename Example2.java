import java.util.*;
class Example2
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the coesficients");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int d=(b*b-4*a*c);
    if(d>0)
    {
      double r1=(-b+ Math.sqrt(d))/2*a;
      double r2=(-b- Math.sqrt(d))/2*a;
      System.out.println("Roots are"+r1+"and"+r2);
    }
     else if(d==0)
     {
       double r=(-b)/2*a;
       System.out.println("Roots are"+r+"and"+r);
     }
     else
     System.out.println("Roots are imaginary");
   }
}
