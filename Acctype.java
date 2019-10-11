import java.util.*;
class Acc
{
  String name,type;
  double acc_no,bal,dep,wd;
  void input()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter name, account number,balance,type of account");
    name=s.nextLine();
    acc_no=s.nextDouble();
    bal=s.nextDouble();
    s.nextLine();
    type=s.nextLine();
  }
  void display()
  {
    System.out.println("balance is "+bal);
  }
  double deposit()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter deposit amount");
    dep=s.nextDouble(); 
    bal=dep+bal;
    return bal; 
  }
  void withdraw()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter money to be withdrawn");
    wd=s.nextDouble();
    bal=bal-wd;
    display();
  } 
  void compute(){}
  void check(){}
}

class Saving extends Acc
{
  float rate,time;
  double intr;
  void compute()
  {
    input();
    Scanner s=new Scanner(System.in);
    System.out.println("enter rate of intrest");
    rate=s.nextFloat();
    System.out.println("enter time");
    time=s.nextFloat();
    intr=bal*Math.pow((1+rate)/100,time);
    System.out.println("intrest is "+intr);
    bal=bal+intr;
    display();
  }
}

class Curr extends Acc
{
  void check()
  {
    input();
    int service=1000;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter minimum balance");
    double minbal=s.nextDouble();
    if(bal<minbal)
    bal=bal-service;
    display();
  }
}

class Acctype
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter choice \n 1.savings account\n 2.current account");
    int c=s.nextInt();
    Acc ref=null;
    if(c==1)
    {
      ref=new Saving();
      ref.compute();
    }
    else
    {
      ref=new Curr();
      ref.check();
    }
    System.out.println("Enter choice \n 1.withdraw\n2.deposit");
    c=s.nextInt();
    if(c==1){
      ref.withdraw();
      ref.display();
    }
    else{ 
      ref.deposit();
      ref.display();
    }
  } 
}
