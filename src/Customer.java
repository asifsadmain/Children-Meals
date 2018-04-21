public class Customer
{
    public static void main(String[] args)
    {
        CounterEmployee employee = new CounterEmployee();

        employee.Construct("Hamburger","Fries", "coke", "toy dinasour");

        employee.showItems();
        employee.showBag();
        employee.showCup();
    }
}