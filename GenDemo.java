import java.util.*;
class Gen<t1,t2>
{
  t1 ob1;
  t2 ob2;
  void disp(t1 ob,t2 o)
  {
    ob1=ob;
    ob2=o;
    System.out.println(ob1+"  "+ob2);
  }
}
class GenDemo
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a String and Integer");
    Gen<String,Integer> t=new Gen<String,Integer>();
    String x=s.nextLine();
    int n=s.nextInt();
    t.disp(x,n); 
  } 
}
