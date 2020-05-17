public class AddAmount {
    private int amount = 50;
    AddAmount()
    {

    }
    AddAmount(int number)
    {
        amount += number;
    }
    public void printAmount()
    {
        System.out.println("The Final Amount is" + " " + amount);

    }
    public static void main(String[] args)
    {
        AddAmount a = new AddAmount();
        a.printAmount();
        AddAmount a1 = new AddAmount(100);
        a1.printAmount();
    }

}
