package studyMaterial.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Separate a list of integers from the list of integers based on the 1st digit of the number.
* If it is 1 then only keep it in the list. Use Streams to perform this task
 * */
public class NumberSeparation {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(123, 456, 178, 234, 199, 567, 102);

        List<Integer> filteredList = integerList.stream()
                .filter(number -> String.valueOf(number).startsWith("1"))
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println(filteredList);
    }
}
