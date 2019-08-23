import java.util.*;
class Employee
{
    int Employee_number,Basic;
    double DA,IT,Net_salary;
    String Employee_name;
    void read_data()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee name");
        Employee_name=s.nextLine();
        System.out.println("Enter Employee number");
        Employee_number=s.nextInt();
        System.out.println("Enter his Basic Salary");
        Basic=s.nextInt();
    }
    void calculate()
    {
        DA=(0.75*Basic);
        IT=(0.3*(DA+Basic));
        Net_salary=Basic+DA-IT;
    }
    void display()
    {
        System.out.println("Details of the employee are-->");
        System.out.println("Employee number is "+Employee_number);
        System.out.println("Employee Name is "+Employee_name);
        System.out.println("Total salary="+Net_salary);
    }
}
class EmployeeDemo {
    public static void main(String args[])
    {
        System.out.println("Employee details");
        Employee e1=new Employee();
        e1.read_data();
        e1.calculate();
        e1.display();
    }
}
