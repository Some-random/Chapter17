/**
 * Created by dongweij on 2015/8/10.
 */
public class Problem3 {
    /*
    The idea is: there are way more 2's than 5's in the factorial calculation, so we only need to count how many 5's do we have.
    And for numbers like 25, they are composed of multiple 5's, so the total number of 5's in number n is
     */
    public static int countZero(int n) {
        int count = 0;
        while(n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countZero(226));
    }
}
