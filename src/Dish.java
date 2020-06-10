public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish(int cost, String name, boolean recommend) {
        this.costInCents = cost;
        this.nameOfDish = name;
        this.wouldRecommend = recommend;
    }

    public int getCost() {
        return this.costInCents;
    }

    public String getName() {
        return this.nameOfDish;
    }

    public boolean getRecommend() {
        return this.wouldRecommend;
    }

    public void flipRecommend() {
        this.wouldRecommend = !this.wouldRecommend;
    }

    public void printSummary() {
        System.out.printf("Cost: %d%nName: %s%nRecommend: %B%n", getCost(), getName(), getRecommend());
    }
}
