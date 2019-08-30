import java.util.*;
class Book
{
  String name,author;
  int num_of_pages;
  float price;
  Book()
  {
    name="";
    author="";
    price=0;
    num_of_pages=0;
  }
  void set(Book ob)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the name of the book");
    ob.name=s.nextLine();
    System.out.println("Enter the name of the author");
    ob.author=s.nextLine();
    System.out.println("Enter the price of the book");
    ob.price=s.nextFloat();
    System.out.println("Enter the number of pages in the book");
    ob.num_of_pages=s.nextInt();
  }
  void get(Book ob)
  {
     System.out.println("The Details are:\n1.Name:"+ob.name+"\n2.Author:"+ob.author+"\n3.Price:"+ob.price+"\n4.Number of pages:"+ob.num_of_pages);
  }
 public String toString()
  {
    String s="1.Name:"+name+"  2.Author:"+author+"  3.Price:"+price+"  4.Number of           pages:"+num_of_pages;
    return s;
  }
}
class BookDemo
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of Books to be created");
    Book ob=new Book();
    int n=s.nextInt();
    Book arr[]=new Book[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=new Book();
      ob.set(arr[i]);
    }
    for(int i=0;i<n;i++)
    {
      ob.get(arr[i]);
    }
  }
}
/* 
Enter the number of Books to be created
2
Enter the name of the book
grand theory
Enter the name of the author
stephen hawking
Enter the price of the book
250
Enter the number of pages in the book
400
Enter the name of the book
revolution 2020
Enter the name of the author
chtan bhagat       
Enter the price of the book
400
Enter the number of pages in the book
500
The Details are:
1.Name:grand theory
2.Author:stephen hawking
3.Price:250.0
4.Number of pages:400
The Details are:
1.Name:revolution 2020
2.Author:chtan bhagat
3.Price:400.0
4.Number of pages:500
*/
