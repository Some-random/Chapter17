import java.util.Arrays;

/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem6 {

    public static void findStartEnd(int[] array) {
        int[] temparray = array.clone();
        Arrays.sort(temparray);
        int start = 0, end = array.length - 1;
        while(start < array.length && temparray[start] == array[start]) { start++; }
        if(start == array.length) {
            System.out.println("Array has been sorted already!");
            return;
        }
        while(end >= 0 && temparray[end] == array[end]) { end--; }
        System.out.println("So the start position is: " + start + ", and the end position is: " + end);

    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 10, 1100, 8, 100, 12, 5, 7, 16, 18, 19};
        findStartEnd(array);
    }
}
