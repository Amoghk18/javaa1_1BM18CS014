import java.util.*;
class Rect
{
int l,b;
void input()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter lenght and breadth");
  l=s.nextInt();
  b=s.nextInt();
 }
void compute()
 {
  float area=l*b;
  System.out.println("The area is"+area);
 }

}
class Rectangle
{
  public static void main(String args[])
  {
   Rect rec1=new Rect();
   Rect rec2=new Rect();
   rec1.input();
   rec1.compute();
   rec2.input();
   rec2.compute();
  }
}
