public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");

        int myFavoriteNumber = 9627;
        String myString = "This is a string yep.";

        float myNumber = 3.14f;

        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

        int x1 = 4;
        x1 += 5;
        System.out.println(x);


        int x2 = 3;
        int y2 = 4;
        y2 *= x2;
        System.out.println(y2);

        int x3 = 10;
        int y3 = 2;
        x3 /= y3;
        y3 -= x3;
        System.out.println(y3);

        byte max = 127;
        System.out.println(++max);

    }
}
