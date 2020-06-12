public class ServerNameGenerator {
    static String[] adjectives = {"humble", "frantic", "sad", "tall", "opaque", "nice", "degenerate", "silly", "quick", "majestic"};
    static String[] noun = {"cat", "chest", "bin", "cheese", "console", "man", "chair", "kingdom", "sun", "pen"};

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(getRandom(adjectives) + "-" + getRandom(noun));
    }

    public static String getRandom(String[] arr) {
        return arr[(int)(Math.random() * arr.length)];
    }
}
