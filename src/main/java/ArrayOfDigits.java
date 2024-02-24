import java.util.Arrays;

public class ArrayOfDigits {

    public static void main(String[] args) {
       int [] result = convertIntTyoArray(589586);
        System.out.println(Arrays.toString(result));
    }

    public static int[] convertIntTyoArray(int n){

       String num = Integer.toString(n);
       int[] arr = new int[num.length()];

        for (int i = 0; i <num.length() ; i++) {
            arr[i] = Character.getNumericValue(num.charAt(i));
        }
        return arr;
    }

}

/*
    How to convert a positive int to an array of digits.
    Input: 490		Output: [4, 9, 0] (as int Array)
     */

