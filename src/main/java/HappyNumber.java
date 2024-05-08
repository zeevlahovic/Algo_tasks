import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappyNumber {

    public static boolean happyNumber (Integer n){

        String nums = n.toString();
        char[]arr = nums.toCharArray();
        int result=0;

        for (char eachNum : arr) {
          result += Character.getNumericValue(eachNum) * Character.getNumericValue(eachNum);
          if (result == 1){
              return true;
          }
        }
        return false;
    }


    /*Write a function that returns true if a number is a happy number, and false if it is an unhappy number.
A happy number is a number defined by the following process:
1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which
does not include 1.
3. Those numbers for which this process ends in 1 are happy.
Example 1:
Input: n = 19 Output: True
Explanation:
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.
Example 2:
Input: n = 20 Output: False

     */






    public static void main(String[] args) {
        System.out.println(happyNumber(19));
        System.out.println(happyNumber(20));
        System.out.println(happyNumber(15));
    }

}
