import java.util.*;
class Vehicle
{
  String model;
  int year;
  String color;
  static int totalv;
  Vehicle(String model,int year,String color)
  {
    this.model=model;
    this.year=year;
    this.color=color;
    totalv++;
  }
  void display()
  {
    System.out.println("-----------------------------------------------");
    System.out.println("Vehicle model is "+model);
    System.out.println("Year is: "+year);
    System.out.println("Vehicle color is "+color);
  }
  static void disp()
  {
    System.out.println("total vehicles are "+totalv);
    System.out.println("-----------------------------------------------");
  }
}
class Vehicledemo
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number of vehicles");
    int n=s.nextInt();
    Vehicle arr[]=new Vehicle[n];
    for(int i=0;i<n;i++)
    {
      Scanner x=new Scanner(System.in);
      System.out.println("Enter model name");
      String m=x.nextLine();
      System.out.println("Enter model year");
      int y=x.nextInt();
      System.out.println("Enter model color");
      x.nextLine();
      String c=x.nextLine();
      arr[i]=new Vehicle(m,y,c);
    }
     for(int i=0;i<n;i++)
    {
      arr[i].display();
      arr[i].disp();
    }
  }
}
