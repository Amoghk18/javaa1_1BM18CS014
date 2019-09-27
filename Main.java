import java.util.*;
abstract class Shape
{
  int l,b;
  abstract void printArea();
  void set()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter l and b");
    l=s.nextInt();
    b=s.nextInt();
  }
}
class Rect extends Shape
{
  void printArea()
  {
    super.set();
    System.out.println("area is "+l*b);
  }
}
class Tri extends Shape
{
  void printArea()
  {
    super.set();
    System.out.println("area is "+(0.5*l*b));
  }
}
class Circle extends Shape
{
  int r;
  void printArea()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter radius");
    r=s.nextInt();
    System.out.println("area is "+3.142*r*r);
  }
}
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    Shape ref=null;
   int n;
    do
   {
    System.out.println("Enter 1 for rectangle \n 2 for triangle \n 3 for circle");
    n=s.nextInt();
    switch(n)
    {
      case 1:
        ref=new Rect();
        break;
      case 2:
        ref=new Tri();
        break;
      case 3:
        ref=new Circle();
        break; 
    }
    ref.printArea();
    System.out.println("Enter 1 to continue");
    n=s.nextInt();
   }while(n==1);
  }
}
