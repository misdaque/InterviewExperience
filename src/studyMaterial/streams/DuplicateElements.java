package studyMaterial.streams;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8, 9);

        List<Integer> duplicates = findDuplicates(numbers);

        System.out.println("List of duplicate elements: " + duplicates);
    }

    private static List<Integer> findDuplicates(List<Integer> numbers) {
        // Using Java Streams to group elements by count and filter duplicates
        Map<Integer, Long> countMap = numbers.stream()
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()));

        // Filtering elements with count greater than 1 (duplicates)
        List<Integer> duplicates = countMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        return duplicates;
    }
}
