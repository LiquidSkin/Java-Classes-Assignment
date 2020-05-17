public class Employee {
     private String name;
     private int year;
     private String address;
    Employee(String name,int year,String address)
    {
        this.name = name;
        this.year = year;
        this.address = address;

    }
    public void printEmployeeInfo()
    {
        System.out.println(name + " " + year + " " + address);
    }
    public static void main(String[] args)
    {
        Employee e = new Employee("Robert", 1994, "64-C Wall Street");
        Employee e1 = new Employee("Sam", 2000, "68-D Wall Street");
        Employee e2 = new Employee("John", 1999, "26-B Wall Street");
        e.printEmployeeInfo();
        e1.printEmployeeInfo();
        e2.printEmployeeInfo();

    }

}
