public class Rectangle {
    private int length;
    private int breadth;
    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }
    Rectangle()
    {
        length = 0;
        breadth = 0;
    }
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    Rectangle(int a)
    {
        length = a;
        breadth = a;
    }
    public int getArea()
    {
        return length * breadth;
    }
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        System.out.println(r.getArea());
        Rectangle r1 = new Rectangle(10,20);
        System.out.println(r1.getArea());
        Rectangle r2 = new Rectangle(10);
        System.out.println(r2.getArea());

    }


}
