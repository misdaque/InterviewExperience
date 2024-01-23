package studyMaterial.streams;


import java.util.Arrays;

/*
* Find the third-largest value from the integer array using streams
* */
public class ThirdLargestNumber {

    public static void main(String[] args) {
        int[] intArray = {10, 5, 20, 8, 15, 25, 18};

        int thirdLargest = Arrays.stream(intArray)
                .distinct()
                .boxed() // Convert to Integer stream
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .skip(2) // Skip the first two elements
                .findFirst() // Get the third-largest element
                .orElseThrow(() -> new IllegalArgumentException("Array has less than 3 distinct elements"));

        System.out.println("Third largest element: " + thirdLargest);
    }
}
