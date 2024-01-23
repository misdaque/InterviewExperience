package studyMaterial.streams;

/*
* Write a java code in streams to check if 2 steings are anagrams or not
* */

import java.util.Arrays;

public class Annagram {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("\\s", "").toLowerCase();

        // Use streams to check if sorted character arrays are equal
        return Arrays.equals(
                cleanStr1.chars().sorted().toArray(),
                cleanStr2.chars().sorted().toArray()
        );
    }

    public static void main(String[] args) {
        String input1 = "Listen";
        String input2 = "Silent";

        if (areAnagrams(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are anagrams.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagrams.");
        }
    }
}
