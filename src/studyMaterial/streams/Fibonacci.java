package studyMaterial.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a java code to get list of fibonacci sequence using streams
 * */
public class Fibonacci {

    public static void main(String[] args) {
        int count = 10; // Adjust the count as needed

        List<Integer> fibonacciList = generateFibonacciSequence(count);

        System.out.println("Fibonacci Sequence:");
        fibonacciList.forEach(System.out::println);
    }

    public static List<Integer> generateFibonacciSequence(int count) {
        return Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(count)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }
}
