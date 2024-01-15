package wissen.misdaque.code;

/******************************************************************************
 Welcome to GDB Online.
 Code, Compile, Run and Debug online from anywhere in world.
 *******************************************************************************/
import java.util.*;

class SplitArray
{
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        int N = array.length;

        int numberOfArrays = N % splitSize == 0 ? N / splitSize : N / splitSize + 1;
        int sizeOflastArray = N % splitSize == 0 ? splitSize : N % splitSize;

        List<int[]> lists = new ArrayList<>();
        int j = 0;
        int[] arr;

        for(int i = 0; i < numberOfArrays - 1; i++){
            arr = new int[splitSize];

            for(int k = 0; k < splitSize; k++){
                arr[k] = array[j++];
            }

            lists.add(arr);

        }

        arr = new int[sizeOflastArray];

        for(int i = 0; i < sizeOflastArray; i++){
            arr[i] = array[j++];
        }

        lists.add(arr);

        return lists;
    }
}



