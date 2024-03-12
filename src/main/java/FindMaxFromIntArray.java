import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FindMaxFromIntArray {

    public static int maxNumber(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int eachNumber : arr) {
            if (eachNumber > maxNum) {
                maxNum = eachNumber;
            }
        }
        return maxNum;
    }


    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};

        int maxNumber = maxNumber(array);
        System.out.println(maxNumber);

    }
}

/*Write a function that can find the maximum number from an int Array.
input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9

 */
