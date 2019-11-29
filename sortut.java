import java.util.*;
class ascen implements Runnable{
    int arr[];
    Thread t;
    ascen(int a[]){
     arr=a;
     t=new Thread(this,"t1");
             t.start();
    }
    public void run(){
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Ascending order is");
        for (int y:arr) {
            System.out.println(y);
        }
    }
}
class descen implements Runnable{
    int arr[];
    Thread t;
    descen(int a[]){
        arr=a;
        t=new Thread(this,"t2");
        t.start();
    }
    public void run(){
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        System.out.println("Descending order is");
        for (int x:arr) {
            System.out.println(x);
        }
    }
}
class sortut {
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        ascen a=new ascen(arr);
        descen d=new descen(arr);
    }
}
