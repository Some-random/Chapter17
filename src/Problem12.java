import java.util.Arrays;

/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem12 {
    public static void printPairSums(int[] input, int result) {
        Arrays.sort(input);
        int begin = 0, end = input.length - 1;
        while(begin < end) {
            if(input[begin] + input[end] < result) {
                begin++;
            }
            else if(input[begin] + input[end] > result) {
                end--;
            }
            else {
                System.out.println(input[begin] + " + " + input[end] + " = " + result);
                while(begin < end && input[begin + 1] == input[begin]) { begin++; }
                while(begin < end && input[end - 1] == input[end]) { end--; }
                begin++;
            }
        }
    }

    //Standard two pointers algorithm
    public static void main(String args[]) {
        int[] test = {9, 3, 6, 5, 7, -1, 13, 14, -2, 12, 0, -2};
        printPairSums(test, 12);
    }
}
