import java.util.*;
interface Stack
{
  void push(int ele);
  int pop();
  void display();
}
class Dynamic implements Stack
{
  int size=5;
  int stk[]=new int[size];
  int top=-1;
  public void push(int ele)
  {
    if(top==size-1)
    {
      System.out.println("Overflow but its extending");
      size=2*size;
      int temp[]=new int[size];
      for(int i=0;i<size;i++)
      {
        temp[i]=stk[i];
      }
      stk=temp;
      stk[++top]=ele;
    }
    else
    stk[++top]=ele;
  }
  public int pop()
  {
    if(top==-1)
    {
      System.out.println("stack underflow\n");
      return -99;
    }
    int x=stk[top];
    top=top-1;
    return x;
  }
  public void display()
  {
    if(top==-1)
    {
      System.out.println("stack is empty\n");
      return;
    }
    for(int i=top;i>-1;i--)
    System.out.println(stk[i]);
  }
} 
class Dynamicdemo
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    Dynamic st=new Dynamic();
    int x,n,y;
    do
    {
      System.out.println("Enter \n1 to push\n 2 to pop\n3 to display\n 4 to exit\n++--------------------++");
      n=s.nextInt();
      switch(n)
      {
      case 1:
        System.out.println("Enter the number to be pushed");
        x=s.nextInt();
        st.push(x);
        break;
      case 2:
        x=st.pop();
        if(x!=-99)
        System.out.println("Popped element is "+x);
        break;
      case 3:
        st.display();
        break;
      case 4:
        System.exit(0);
        break; 
      }
      System.out.println("Enter 1 to continue");
      n=s.nextInt();
    }while(n==1);
  }
}





























