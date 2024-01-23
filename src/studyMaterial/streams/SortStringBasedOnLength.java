package studyMaterial.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
*
* Sort the List of Strings using the length of the String.
* If the length are same then it should be sorted lexicographically.
* */
public class SortStringBasedOnLength {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear");

        List<String> sortedList = stringList.stream()
                .sorted((s1, s2) -> {
                    // First, compare by length
                    int lengthComparison = Integer.compare(s1.length(), s2.length());

                    // If lengths are the same, compare lexicographically
                    return (lengthComparison != 0) ? lengthComparison : s1.compareTo(s2);
                })
                .collect(Collectors.toList());

        // Print the sorted list
        System.out.println(sortedList);
    }
}
