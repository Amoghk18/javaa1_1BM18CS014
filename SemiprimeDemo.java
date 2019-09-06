import java.util.*;
class Semiprime
{
    int n,t,s,m;
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        n=s.nextInt();
    }
    void Sum()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(n==(i+j))
                {
                    int b=semi(i);
                    int c=semi(j);
                    if(b==1 && c==1)
                        m=1;
                    else
                      m=0;  
                }
                else
                    continue;
            }
        }
        if(m==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
    int semi(int m)
    {
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<m;j++)
           {
               if (m==(i*j))
               {
                   t = isprime(i);
                   s = isprime(j);
                   if(t==1 && s==1)
                   {
                      return 1;
                   }
                   else
                      return 0;
               }
            
                  
           }
       }
	return 0;
    }
    int isprime(int a)
    {
        int c=0;
        for(int i=2;i<=(a/2);i++)
        {
            if(a%i==0)
                return 0;
            else
                c=1;
        }
        if(c==1)
            return 1;
        else 
            return 0;
    }
}
class SemiprimeDemo {
    public static void main(String args[])
    {
        Semiprime ob=new Semiprime();
        ob.input();
        ob.Sum();
    }
}
