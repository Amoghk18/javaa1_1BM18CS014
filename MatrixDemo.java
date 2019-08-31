import java.util.*;
class Matrix
{
    float d;
    Scanner s=new Scanner(System.in);
    float arr[][]=new float[2][2];
    Matrix()
    {
        for (int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                arr[i][j]=0;
        }
    }
        Matrix(Matrix ob)
        {
            for (int i=0;i<2;i++)
            {
                for (int j=0;j<2;j++)
                    arr[i][j]=ob.arr[i][j];
            }
        }
        void det()
        {
            d=((arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0]));
            System.out.println(d+" is the determinant");
        }
        int isSingular()
        {
            if(d!=0)
                return 1;
            else
                return 0;
        }
        void inverse()
        {
            float t;
            t=arr[0][0];
            arr[0][0]=arr[1][1];
            arr[1][1]=t;
            arr[0][1]=(1/d)*(0-arr[0][1]);
            arr[1][0]=(1/d)*(0-arr[1][0]);
            arr[0][0]=(1/d)*arr[0][0];
            arr[1][1]=(1/d)*arr[1][1];
        }
        void print()
        {
            System.out.println("The inverse matrix is");
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
            }
        }
        void set()
        {
            System.out.println("Enter the members of the matrix");
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    arr[i][j]=s.nextInt();
                }
                System.out.println();
            }
        }
    }
class MatrixDemo
{
    public static void main(String args[])
    {
        Matrix ob1=new Matrix();
        ob1.set();
        Matrix ob2=new Matrix(ob1);
        ob1.det();
        int x=ob1.isSingular();
        if(x==0)
        {
            System.out.println("As the determinant of the matrix is 0 its inverse does not exist");
        }
        else
        {
            ob1.inverse();
            ob1.print();
        }
    }
}