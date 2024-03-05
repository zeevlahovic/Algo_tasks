import java.util.ArrayList;
import java.util.stream.Stream;

public class SumOfDigits {

    public static void main(String[] args) {
        sumOfDigits(12);
    }


    public static void sumOfDigits(Integer n){

        String num = n.toString();
        ArrayList<Integer> numbers = new ArrayList<>();
       // int sumOfDigits = 0;

        for (int i = 0; i <num.length() ; i++) {
            numbers.add(Character.getNumericValue(num.charAt(i)));
        }
      /*  for (Integer eachNumber : numbers) {
            sumOfDigits += eachNumber;
        }
       */
        int sumOfDigits = numbers.stream().reduce(Integer::sum).get();
    }
}

/*Given a number, write a method that finds the sum of its digits.
Examples :
Input: n = 687
Output: 21
Input: n = 12
Output: 3

 */

//convert integer to string
//split the given number into single digits and put the in a list
//created empty list where we going to store the numbers
//create a int variable where we going to store the sum
//iterate the string by the index numbers
//add numerical value of each char and sum them up
