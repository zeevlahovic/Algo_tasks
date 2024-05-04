import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] arr) {

        int intFromArr = 0;
        int result = 0;

        for (int eachNum : arr) {
            intFromArr = intFromArr * 10 + eachNum;
        }

        result = intFromArr + 1;

        String num = Integer.toString(result);

        int[] arrResult = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {

            arrResult[i] = Character.getNumericValue(num.charAt(i));
        }

        return arrResult;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int[] arr2 = {4,3,2,1};
        int[] arr3 = {9};

        System.out.println(Arrays.toString(plusOne(arr)));
        System.out.println(Arrays.toString(plusOne(arr2)));
        System.out.println(Arrays.toString(plusOne(arr3)));
    }
}
