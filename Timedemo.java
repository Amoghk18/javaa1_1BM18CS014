import java.util.*;
class Time
{
  int h,m,s;
  Time(){h=0;m=0;s=0;}
  Time(int a,int b,int c)
  {
    h=a;
    m=b;
    s=c;
  }
  void current_time(int a,int b,int c)
  {
   h=a; m=b; s=c;
  }
  void advance(int hr,int min,int sec)
  {
    h+=hr;
    m+=min;
    s+=sec;
    m+=s/60;
    s=s%60;
    h+=m/60;
    m=m%60;
    h=h%24;
  }
  void display()
  {
    System.out.println("The time is");
    System.out.println(h+":"+m+":"+s);
  }
}
class Timedemo
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    while(true)
   {
    System.out.println("enter 1 for current time and 2 for advanced time");
    int n=s.nextInt();
    switch(n)
    {
      case 1: Time a=new Time();
              System.out.println("Enter Hour Minutes and seconds");
              int hh=s.nextInt();
              int mm=s.nextInt();
              int ss=s.nextInt();
              a.current_time(hh,mm,ss);
              a.display();
              break;
      case 2: Time b=new Time();
              System.out.println("Enter Hour Minutes and seconds");
              int hr=s.nextInt();
              int min=s.nextInt();
              int sec=s.nextInt();
              b.advance(hr,min,sec);
              b.display();
    }
   }
  }
}
