import java.util.*;
class Student
{
  String USN,name;
  int[] marks,credits;
  int sub;
  float SGPA;
  void input()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Name of the studemt");
    name=s.next();
    System.out.println("Enter the USN");
    USN=s.next();
    System.out.println("Enter the number of subjects");
    sub=s.nextInt();
    System.out.println("Enter the Credits for the subjects");
    credits=new int[sub];
    for(int i=0;i<sub;i++)
    credits[i]=s.nextInt();
    System.out.println("Enter the marks of the respective subjects");
    marks=new int[sub];
    for(int i=0;i<sub;i++)
    marks[i]=s.nextInt();
  }
  int gradepoint(int m)
  {
    
      if(m>=90 && m<=100)
      {
       return 10; 
      }
      else if(m>=75 && m<90)
      {
        return 9;
      }
      else if(m>=65 && m<75)
      {
        return 8;
      } 
      else if(m>=55 && m<65)
      {
        return 7;
      }
      else if(m>=45 && m<55)
      {
        return 6;
      }
      else
      {
        return 0;
      }
  }
void calculate()
{ 
  float t=0,c=0;
  for(int i=0;i<sub;i++)
  {
    t+=gradepoint(marks[i])*credits[i];
    c+=credits[i];
  }
  SGPA=t/c;
}
void display()
{
  System.out.println("Name:"+name);
  System.out.println("USN:"+USN);
  System.out.println("SGPA:"+SGPA); 
}
}
class StudentDemo
{
  public static void main(String args[])
  {
    Student s1=new Student();
    s1.input();
    s1.calculate();
    s1.display();
  }
}





