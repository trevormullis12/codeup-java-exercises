public class DishTest {
    public static void main(String[] args) {
//        new DishTools();
        Dish dish1 = new Dish(2000, "Steak", true);
        dish1.printSummary();

        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.analyzeDishCost(dish1));
        DishTools.flipRecommendation(dish1);
        dish1.printSummary();
    }
}
