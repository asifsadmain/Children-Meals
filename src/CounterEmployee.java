public class CounterEmployee
{
    private IMealBuilder crew = new Crew();
    private Bag bag = crew.getBag();
    private Cup cup = crew.getCup();
    private ChildrenMeals meals = crew.getMeal();

    public void Construct(String mainItem, String sideItem, String drinks, String toy)
    {
        this.crew = crew;
        crew.addMainItem(mainItem);
        crew.addSideItem(sideItem);
        crew.addDrink(drinks);
        crew.addToy(toy);
    }


    public void showItems()
    {
        System.out.println("The ordered main item is: "+meals.getMainItem());
        System.out.println("The ordered side item is: "+meals.getSideItem());
        System.out.println("The ordered drink is: "+meals.getDrink());
        System.out.println("The ordered toy is: "+meals.getToy());
    }


    public void showBag()
    {
        System.out.println();
        System.out.println("The items in the bag are: "+bag.getMainItem()+","+bag.getSideItem()+","+bag.getToy());
    }

    public void showCup()
    {
        System.out.println("The item in the cup is: "+cup.getDrink());
    }
}