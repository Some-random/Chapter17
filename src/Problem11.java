import java.util.Random;

/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem11 {
    public static int rand5() {
        Random rd = new Random();
        return rd.nextInt(5);
    }

    public static int rand7() {
        Random rd = new Random();
        return rd.nextInt(7);
    }

    public static void main(String[] args) {
        System.out.println(rand5());
        System.out.println(rand7());
    }
}
