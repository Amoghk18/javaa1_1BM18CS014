import java.util.*;
class Average {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of students and number of subjects");
        int m=s.nextInt();
        int n=s.nextInt();
        float arr[][]=new float[m+2][n+2];
        System.out.println("Enter the marks of "+m+" students in "+n+" subjects");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.nextFloat();
            }
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][n]=arr[i][n]+arr[i][j];
        }
        for(int i=0;i<m;i++)
        {
            arr[i][n+1]=arr[i][n]/n;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                arr[m][j]=arr[m][j]+arr[i][j];
        }
        for(int i=0;i<n;i++)
        {
            arr[m+1][i]=arr[m][i]/m;
        }
        System.out.println("The table is displayed with Total and Average");
        for(int i=0;i<m+2;i++)
        {
            for(int j=0;j<n+2;j++)
            {
                if(i>=m && j>=n)
                    continue;
                else
                    System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
/*
Enter the number of students and number of subjects
2 4
Enter the marks of 2 students in 4 subjects
3 4 5 6

6 7 8 5

The table is displayed with Total and Average
3.0  4.0  5.0  6.0  18.0  4.5
6.0  7.0  8.0  5.0  26.0  6.5
9.0  11.0  13.0  11.0
4.5  5.5  6.5  5.5
 */