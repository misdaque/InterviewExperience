package studyMaterial.streams;


import java.util.List;
import java.util.stream.Collectors;

/*
 * A list of Strings is given and a prefix is given.
 * Filter out the list based on the prefix and return a list of strings along with
 * the number of unique characters in the String
 *
 */
public class PrefixAppendWithNumberOfUniqueCharacters {

    public static void main(String[] args) {

        List<String> strings = List.of("apple", "banana", "orange", "appetizer", "ornament");
        String prefix = "app";

        System.out.println(getFilteredList(strings, prefix));

    }

    public static List<String> getFilteredList(List<String> strings, String prefix) {

        List<String> filteredList = strings.stream()
                .filter(str -> str.startsWith(prefix))
                .map(str -> str + " " + str.chars().distinct().count())
                .collect(Collectors.toList());

        return filteredList;
    }
}
