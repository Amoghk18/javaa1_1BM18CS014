import java.util.*;
class Customer
{
  private int cust_n,price,quantity;
  private String cust_name;
  private double total_price,net_price,discount;
  Customer()
  {
    cust_n=0;
    cust_name=" ";
    price=0;
    quantity=0;
  }
  Customer(int cust_n,int price,String cust_name,int quantity)
  {
    this.cust_n=cust_n;
    this.price=price;
    this.cust_name=cust_name;
    this.quantity=quantity;
  }
  void input()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Customer number,customer name,quantity,price");
    cust_n=s.nextInt();
    cust_name=s.nextLine();
    s.nextLine();
    quantity=s.nextInt();
    price=s.nextInt();
    total_price=price*quantity;
    if(total_price>=50000)
    discount=(0.25*total_price);
    else if(total_price>=25000 && total_price<50000)
    discount=(0.1*total_price);
    else
    discount=0;
    net_price=total_price-discount;
  }
  void display()
  {
    System.out.println("Details are:\nCustomer number:"+cust_name+"customer name: "+cust_name+"\ntotal price: "+total_price);
  }
}
class Price
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number of customers");
    int n=s.nextInt();
    Customer arr[]=new Customer[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=new Customer();
      arr[i].input();
      arr[i].display();
    }
  }
}
