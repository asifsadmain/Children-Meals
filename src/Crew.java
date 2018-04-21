public class Crew implements IMealBuilder
{
    private ChildrenMeals order = new ChildrenMeals();
    private Bag bag = new Bag();
    private Cup cup = new Cup();

    @Override
    public void addMainItem(String mainItem) {
        order.setMainItem(mainItem);
        bag.setMainItem(mainItem);
    }

    @Override
    public void addSideItem(String sideItem) {
        order.setSideItem(sideItem);
        bag.setSideItem(sideItem);
    }

    @Override
    public void addDrink(String drink) {
        order.setDrink(drink);
        cup.setDrink(drink);
    }

    @Override
    public void addToy(String toy) {
        order.setToy(toy);
        bag.setToy(toy);
    }

    @Override
    public ChildrenMeals getMeal() {
        return order;
    }

    @Override
    public Bag getBag() {
        return bag;
    }

    @Override
    public Cup getCup() {
        return cup;
    }
}