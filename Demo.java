import java.util.*;
class Person
{
  String name;
  int age;
  String address;
  void setdata()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter name:");
    name=s.nextLine();
    System.out.println("Enter age:");
    age=s.nextInt();
    System.out.println("Enter address:");
    s.nextLine();
    address=s.nextLine();
  }
  void getdata()
    {
      System.out.println("Details:\nname: "+name+"\nage: "+age+"\naddress: "+address);
    }
}
class Student extends Person
{
  int roll;
  int sem;
  void setdata()
  {
    Scanner s=new Scanner(System.in);
    super.setdata();
    System.out.println("Enter roll number:");
    roll=s.nextInt();
    System.out.println("Enter semester:");
    sem=s.nextInt();
  }
  void getdata()
    {
      super.getdata();
      System.out.println("Roll: "+roll+"\nsem "+sem);
    }
}
class Exam extends Student
{
  int marks1,marks2;
  float avg;
  void setdata()
  {
    super.setdata();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Marks1:");
    marks1=s.nextInt();
    System.out.println("Enter Marks2:");
    marks2=s.nextInt();
  } 
  void getdata()
  {
    super.getdata();
  }
  float compute()
  { 
    return ((marks1+marks2)/2);
  }
}
class Demo
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number of students");
     int n=s.nextInt();
     float marks[]=new float[n];
     Exam arr[]=new Exam[n];
     for(int i=0;i<n;i++)
     {
       arr[i]=new Exam();
       arr[i].setdata();
       marks[i]=arr[i].compute();
     }
     float large=0;
     int max=0;
     for(int j=0;j<n;j++)
     {
        if(marks[j]>large)
        {
          large=marks[j];
          max=j;
        }
        else
        continue;
     }
     System.out.println("The details of topper are:");
     arr[max].getdata();
     System.out.println("Average:"+large);
  }  
}










