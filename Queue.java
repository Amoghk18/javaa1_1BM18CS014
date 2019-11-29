import java.util.*;
interface Iqueue
{
    void insert(int item);
    void delete();
    void isempty();
}
class Queuetest implements Iqueue
{
    int f=0,r=-1;
    int Size=5;
    int arr[]=new int[Size];
   public void insert(int item)
    {
        int i=0;
        if(r==Size-1)
        {
            Size=Size*2;
            int temp[]=new int[Size];
            for(i=0;i<Size/2;i++)
                temp[i]=arr[i];
            arr=temp;
            arr[i]=item;
        }
        else
            arr[++r]=item;
    }
    public void delete()
    {
        if(f>r)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[f]+" is deleted");
        f++;
    }
    public void  isempty()
    {
        if(r==-1)
          System.out.println("empty");
        else System.out.println("not empty");
    }
}
class Queue
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Queuetest q=new Queuetest();
        int n,item;
        do{
            System.out.println("Enter\n1.insert\n2.delete\n3.to check whether queue is empty");
            n=s.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the elemenet");
                    item=s.nextInt();
                    q.insert(item);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.isempty();
                    break;
            }
            System.out.println("press 1 to continue");
            n=s.nextInt();
        }while(n==1);
    }
}
