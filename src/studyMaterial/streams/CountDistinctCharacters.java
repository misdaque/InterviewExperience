package studyMaterial.streams;


import java.util.List;
import java.util.stream.Collectors;

/*
 * Java code using stream to find list of number of
 * distinct characters in all strings in a list of strings
 * */
public class CountDistinctCharacters {

    public static void main(String[] args) {
        List<String> stringList = List.of("hello", "world", "java", "stream");

        List<Long> distinctCharacterCounts = stringList.stream()
                .map(s -> (long) s.chars().distinct().count())
                .collect(Collectors.toList());

        System.out.println("List of distinct character counts for each string: " + distinctCharacterCounts);
    }
}
