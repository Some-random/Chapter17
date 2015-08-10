/**
 * Created by dongweij on 2015/8/10.
 */
public class Problem1 {
    public static void swapNumIinplace(int a, int b) {
        // Example for a = 9, b = 4
        a = a - b; // a = 9 - 4 = 5
        b = a + b; // b = 5 + 4 = 9
        a = b - a; // a = 9 - 5

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        swapNumIinplace(100, 10);
    }
}
