public class MorningWarmups {
    public static void main(String[] args) {
        for(int i = 1; i <= 50;  i += 5) {
            System.out.println(i);
            if(i == 1)
                i--;
        }
    }
}
