import java.util.*;
class Point {
    private int x,y;
    Point()
    {x=0;y=0;}
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    Point( Point ob)
    {
        x=ob.x;
        y=ob.y;
    }
    double calculate(Point ob)
    {
        return (Math.sqrt(Math.pow((x-ob.x),2)+Math.pow((y-ob.y),2)));
    }
}
class PointDemo
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       Point p1=new Point(1,2);
       Point p2=new Point(p1);
       System.out.println("distance betwwen p1 and p2 is");
       double d=p1.calculate(p2);
       System.out.println(d);
       System.out.println("Enter 2 co-ordinates");
       int x=s.nextInt();
       int y=s.nextInt();
       int x1=s.nextInt();
       int y1=s.nextInt();
       Point p3=new Point(x,y);
       Point p4=new Point(x1,y1);
       double d1=p3.calculate(p4);
       System.out.println(d1+" is the distance");
    }
}
/*
distance betwwen p1 and p2 is
0.0
Enter 2 co-ordinates
0 0
4 5
6.4031242374328485 is the distance
*/
