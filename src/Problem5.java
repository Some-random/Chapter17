/**
 * Created by dongweij on 2015/8/10.
 */
public class Problem5 {
    public static void hits(String guess, String solution) {
        int[] solhit = {0, 0, 0, 0};
        int[] guesshit = {0, 0, 0, 0};
        int i, j;
        //Initialize the solhit array with the number of 'R', 'G', 'B' and 'Y' in the solution string
        for(i = 0; i < solution.length(); i++) {
            switch (solution.charAt(i)) {
                case 'R':
                    solhit[0]++;
                    break;
                case 'Y':
                    solhit[1]++;
                    break;
                case 'G':
                    solhit[2]++;
                    break;
                case 'B':
                    solhit[3]++;
            }
        }
        //Initialize the guesshit array with the number of 'R', 'G', 'B' and 'Y' in the solution string
        for(i = 0; i < guess.length(); i++) {
            switch (guess.charAt(i)) {
                case 'R':
                    guesshit[0]++;
                    break;
                case 'Y':
                    guesshit[1]++;
                    break;
                case 'G':
                    guesshit[2]++;
                    break;
                case 'B':
                    guesshit[3]++;
            }
        }

        int realhit = 0;
        int psudohit = 0;
        //Calculate the totalhit with the min of both arraies
        for(i = 0; i < 4; i++) {
            psudohit += Math.min(solhit[i], guesshit[i]);
        }
        //Calculate the realhit with the exact char comparsion
        for(i = 0; i < 4; i++) {
            realhit += (guess.charAt((i)) == solution.charAt(i)) ? 1 : 0;
        }
        //So the psudo hit is total hit minus real hit
        System.out.println("So the realhits is " + realhit + ", and the psudo hits is " + (psudohit - realhit));
    }
    
    public static void main(String args[]) {
        hits("GGRR", "RGBY");
    }

}
