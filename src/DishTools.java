public class DishTools {
    final static int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static String shoutDishName(Dish d1) {
        return d1.getName().toUpperCase();
    }

    public static String analyzeDishCost(Dish d1) {
        if(d1.getCost() >= AVERAGE_COST_OF_DISH_IN_CENTS) {
            return "More expensive than average";
        }
        else return "Less expensive than average";
    }

    public static void flipRecommendation(Dish d1) {
        d1.flipRecommend();
    }
}
