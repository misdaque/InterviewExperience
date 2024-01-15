package Altimetrik.misdaque.codes;

public class ArrayRotation {

    public static void main(String[] args) {

        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        //{5 6 7 1 2 3 4 }
        //{7 6 5 4 3 2 1} - rotation
        //{5 6 7 1 2 3 4} - 2 rotation , 0 - n -1... n  - length() - 1
        int n = 3;

        int length = inputArray.length;

        System.out.println("Before rotation");

        for(int i : inputArray)
            System.out.print(i + " ");

        rotate(inputArray, n);

        System.out.println();

        System.out.println("After rotation");

        for(int i : inputArray)
            System.out.print(i + " ");
    }

    public static void rotate(int[] arr, int n){
        int length = arr.length;

        if(n == length)
            return;

        n = n % length;

        rotate(arr, 0, length - 1);
        rotate(arr, 0, n - 1);
        rotate(arr, n, length - 1);

    }

    public static void rotate(int[] arr, int start, int end){

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
