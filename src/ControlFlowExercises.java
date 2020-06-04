public class ControlFlowExercises {
    public static void main(String[] args) {
        for(int i = 5; i <= 15; i++)
            System.out.print(i + " ");
        System.out.print("\n");
        for(long i = 2; i < 1000000; i *= i)
            System.out.println(i);
    }
}
