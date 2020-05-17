public class Student {
    String name;
    Student()
    {
        name = "Unknown";
    }
    Student(String name)
    {
        this.name = name;
    }
    void printStudentInfo()
    {
        System.out.println(name + " ");
    }
    public static void main(String[] args)
    {
        Student s = new Student();
        s.printStudentInfo();
        Student s1 = new Student("John");
        s1.printStudentInfo();
    }
}
