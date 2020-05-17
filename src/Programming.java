public class Programming {
    String result;
    Programming()
    {
        result = "I love programming languages";
    }
    Programming(String s)
    {
        result = "I love" + " " + s;
    }
    public void printString()
    {
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        Programming p = new Programming();
        p.printString();
        Programming j = new Programming("java");
        j.printString();
    }
}
