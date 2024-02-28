import java.util.ArrayList;
import java.util.stream.Stream;

public class SumOfDigits {

    public static void main(String[] args) {
        sumOfDigits(12);
    }


    public static void sumOfDigits(Integer n){

        String num = n.toString();
        ArrayList<Integer> numbers = new ArrayList<>();
        int sumOfDigits = 0;

        for (int i = 0; i <num.length() ; i++) {
            numbers.add(Character.getNumericValue(num.charAt(i)));
        }

        for (Integer eachNumber : numbers) {
            sumOfDigits += eachNumber;
        }
        System.out.println(sumOfDigits);
    }
}

/*Given a number, write a method that finds the sum of its digits.
Examples :
Input: n = 687
Output: 21
Input: n = 12
Output: 3

 */
