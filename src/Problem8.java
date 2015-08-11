/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem8 {
    /*
    Straightforward DP approach, if the sum is smaller than 0 at any point, just set it to 0
     */
    public static int minseq(int[] input) {
        int result = Integer.MIN_VALUE;
        int temp = input[input.length - 1];
        for(int i = input.length - 2; i >= 0; i--) {
            result = Integer.max(result, temp);
            temp = Integer.max(0, temp);
            temp += input[i];
        }
        return result;
    }

    public static void main(String args[]) {
        int[] input = {2, -8, 3, -2, 4, -10};
        System.out.println("The result is: " + minseq(input));
    }
}
