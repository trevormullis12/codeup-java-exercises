package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        input.yesNo();
        input.getInt(10, 16);
        input.getDouble(1.6, 2.5);
    }
}
