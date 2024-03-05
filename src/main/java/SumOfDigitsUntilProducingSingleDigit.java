import java.util.ArrayList;

public class SumOfDigitsUntilProducingSingleDigit {

    public static void main(String[] args) {

        int result = sumOfDigitsUntilSingleDigit(942);
        System.out.println(result);
    }


    public static int sumOfDigitsUntilSingleDigit(Integer n) {

        String num = n.toString();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < num.length(); i++) {
            numbers.add(Character.getNumericValue(num.charAt(i)));
        }
       /* for (Integer eachNumber : numbers) {
            sumOfDigits += eachNumber;
        }
        System.out.println(sumOfDigits);

        */

        int sumOfDigits = numbers.stream().reduce(Integer::sum).get();

        while (sumOfDigits >= 10) {
            sumOfDigits = sumOfDigitsUntilSingleDigit(sumOfDigits);

        }
        return sumOfDigits;
    }
}



/*Given n, write a method that returns the sum of the digits of n. If that value has more than one digit,
continue reducing in this way until a single-digit number is produced. The input will be a non-negative
integer.
Examples
 16 --> 1 + 6 = 7
 942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2

 */
