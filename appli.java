import java.util.*;
class lesbal extends Exception{
    String s;
    lesbal(String a){s=a;}
    public String toString(){
        return s;
    }
}
class banking{
    String name;
    long accno;
    double bal=0;
    void set(String n,long a,double bal){
        name=n;
        accno=a;
        this.bal=bal;
    }
    void deposit(Double amt){
        bal+=amt;
        System.out.println("balance is "+bal);
    }
    void with(Double amt){
        try{
            if(amt>(bal-2000))
                throw new lesbal("insufficient balance");
            bal-=amt;
            System.out.println("The new balance after withdrawal is "+bal);
        }
        catch(lesbal e){
            System.out.println(e);
        }

    }
}
class appli {
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name,account number and balance");
        banking b=new banking();
        b.set(s.nextLine(),s.nextLong(),s.nextDouble());
        System.out.println("How much do you want to deposit");
        b.deposit(s.nextDouble());
        System.out.println("How much do you want to withdraw");
        b.with(s.nextDouble());
    }
}
