import java.util.*;
import CIE.*;
import SEE.*;
class Marks{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter number of students");
  int n=s.nextInt();
  Internals i[]=new Internals[n];
  External e[]=new External[n];
  for(int j=0;j<n;j++)
  {
    i[j]=new Internals();
    i[j].set();
    e[j]=new External();
    e[j].set();
  }
  System.out.println("Final marks of "+n+" Students int 5 cources are:");
  for(int j=0;j<n;j++)
  {
    for(int k=0;k<5;k++)
    {
      System.out.println("Marks of student "+(j+1)+" in course "+(k+1)+" are: "+(i[j].cie[k]+e[j].see[k]));
    }
  }
  }
}
