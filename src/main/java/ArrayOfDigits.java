import java.util.Arrays;

public class ArrayOfDigits {


    public static void main(String[] args) {
        int[] print = convertIntToArray(545);
        System.out.println(Arrays.toString(print));
    }

    public static int [] convertIntToArray(int n){
        String num = Integer.toString(n);
        int[]result = new int[num.length()];

        for (int i = 0; i <num.length() ; i++) {
            result[i] = Character.getNumericValue(num.charAt(i));
        }
        return result;
    }


}

 /*
    How to convert a positive int to an array of digits.
    Input: 490		Output: [4, 9, 0] (as int Array)
     */