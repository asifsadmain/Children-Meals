public interface IMealBuilder
{
    void addMainItem(String mainItem);
    void addSideItem(String sideItem);
    void addDrink(String drink);
    void addToy(String toy);
    ChildrenMeals getMeal();
    Bag getBag();
    Cup getCup();
}