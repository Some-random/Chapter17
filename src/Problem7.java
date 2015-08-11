/**
 * Created by dongweij on 2015/8/11.
 */



public class Problem7 {
    public static String[] digits = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public static String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String numToString(int number) {
        if(number == 0) {
            return "Zero";
        }

        if(number < 0) {
            return "Negative " + numToString(-1 * number);
        }

        if(number < 1000) {
            return numToStringLessThanThousand(number);
        }
        else if(number < 1000000){
            return numToString(number / 1000) + "Thousand " + numToStringLessThanThousand(number % 1000);
        }
        else if(number < 1000000000) {
            return numToString(number / 1000000) + "Million " + numToString((number % 1000000) / 1000) + "Thousand " +
                    numToStringLessThanThousand(((number % 1000000) / 1000) % 1000);
        }
        return "";
    }

    public static String numToStringLessThanThousand(int number) {
        String s = "";
        int digit = number % 10;
        number /= 10;
        int tendigit = number % 10;
        number /= 10;
        int hundreddigit = number % 10;
        if(hundreddigit > 0) {
            s += digits[hundreddigit - 1] + " " + "Hundred" + " ";
        }
        if(tendigit > 1) {
            s += tens[tendigit - 1] + " ";
            if(digit > 0) {
                s += digits[digit - 1] + " ";
            }
        }
        else if(tendigit == 1) {
            if(digit > 0) {
                s += teens[digit - 1] + " ";
            }
            else {
                s += tens[0] + " ";
            }
        }
        else {
            s += digits[digit - 1] + " ";
        }
        return s;
    }



    public static void main(String[] args) {
        System.out.println(numToString(1));
        System.out.println(numToString(210));
        System.out.println(numToString(12344));
        System.out.println(numToString(-12344));
        System.out.println(numToString(1222222));
    }
}
