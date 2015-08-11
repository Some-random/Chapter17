import java.util.HashMap;

/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem9 {
    public static void createMap(HashMap<String, Integer> HSi, String[] input) {
        int i;
        for (i = 0; i < input.length; i++) {
            if (!HSi.containsKey(input[i].toLowerCase())) {
                HSi.put(input[i].toLowerCase(), 1);
            } else {
                HSi.put(input[i].toLowerCase(), HSi.get(input[i].toLowerCase()) + 1);
            }
        }
        return;
    }

    //The problem statement isn't clear enough, looking at the solution, it looks like the input words
    //are given in the form of string array, which means we don't need to do any text manipulation like
    //string.split()
    public static void main(String[] args) {
        String input[] = {"Cracking", "the", "coding", "interview", "by", "coding", "a", "lot"};
        HashMap<String, Integer> HSi = new HashMap<String, Integer>();
        createMap(HSi, input);
        for(String it : HSi.keySet()) {
            System.out.println(it.toLowerCase() + " " + HSi.get(it));
        }
    }
}
