import java.util.*;
class Endsort {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int n=s.nextInt();
        int arr[]=new int[n];
        int y=0;
        System.out.println("Enter the numbers to be sorted");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int j=0;j<n;j++) {
            for(int i=0;i<n-1;i++)
            {

                    if(arr[i]>arr[i+1])
                    {
                        int x=arr[i];
                        for(int k=i+1;k<n;k++)
                        {
                            arr[k-1]=arr[k];
                        }
                        arr[n-1]=x;
                        y++;
                    }
            }
        }
        System.out.println(y);
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
