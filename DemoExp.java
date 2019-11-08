import java.util.*;
class WrongAge extends Exception
{
  String s;
  WrongAge(String n){
  s=n;
  }
  public String toString()
  {
    return s;
  }
}
class Father
{
  int fage;
  Father() throws WrongAge
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter father's age:");
      fage=s.nextInt(); 
      if(fage<0)
      throw new WrongAge("Father's age is less than 0");
  }
}
class Son extends Father
{
  int sage;
  Son() throws WrongAge
  {
    super();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Son's age:");
      sage=s.nextInt(); 
      if(sage<0)
      throw new WrongAge("Son's age is less than 0");
      if(fage-sage<21)
      throw new WrongAge("Difference should be 21 years");
  }
}
class DemoExp
{
  public static void main(String args[])
  {
   try{
     Son s=new Son();
   } 
   catch(WrongAge e)
   {
      System.out.println(e);
   } 
  }
}
