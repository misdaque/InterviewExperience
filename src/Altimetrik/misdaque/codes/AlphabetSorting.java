package Altimetrik.misdaque.codes;

/*
* Given a String, sort the String in such a way that the Uppercase strings will come first
* and will be lexicographically arranged, and then arrange smaller case letters lexicographically.
 * */
public class AlphabetSorting {

    public static void main(String[] args) {

        String input = "srbDKi";

        System.out.println("Before Sorting : " + input);

        int[] upperCase = new int[26];
        int[] lowerCase = new int[26];

        countFrequency(upperCase, lowerCase, input);

        String ans = buildAnswer(upperCase, lowerCase);

        System.out.println("After Sorting : " + ans);
    }

    public static void countFrequency(int[] upperCase, int[] lowerCase, String input) {

        int length = input.length();

        for (int i = 0; i < length; i++) {
            char temp = input.charAt(i);

            if (temp >= 'a' && temp <= 'z') {
                lowerCase[temp - 'a']++;
            } else {
                upperCase[temp - 'A']++;
            }
        }

    }

    public static String buildAnswer(int[] upperCase, int[] lowerCase) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 26; i++) {

            if (upperCase[i] > 0) {
                char temp = (char) ('A' + i);

                ans.append(temp);
            }

        }

        for (int i = 0; i < 26; i++) {

            if (lowerCase[i] > 0) {
                char temp = (char) ('a' + i);

                ans.append(temp);
            }

        }

        return ans.toString();
    }
}
