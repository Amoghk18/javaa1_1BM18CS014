import java.util.*;
class Account
{
  String name;
  int cust_n;
  float balance;
  void input()
  {
    System.out.println("Enter name of customer");
    Scanner s=new Scanner(System.in);
    name=s.nextLine();
    System.out.println("Enter customer number");
    cust_n=s.nextInt();
    System.out.println("Enter balance");
    balance=s.nextFloat();
  }
  void display()
  {
     System.out.println("Name of customer is: "+name);
     System.out.println("Enter customer number: "+cust_n);
     System.out.println("Balance is: "+balance);
  }
}
class Savings extends Account
{
  float intrest;
  float rate;
  float time;
  void input1()
  {
    input();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter intrest rate");
    rate=s.nextFloat();
    System.out.println("Enter time");
    time=s.nextFloat();
  }
  void compute()
  {
    intrest=(balance*rate*time)/100;
  }
  void display1()
  {
    display();
    System.out.println("Intrest is "+intrest);
  }
}
class Inherit
{
  public static void main(String args[])
  {
    Savings ob=new Savings();
    ob.input1();
    ob.compute();
    ob.display1();
  }
}
