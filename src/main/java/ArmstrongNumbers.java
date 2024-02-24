import java.util.List;

public class ArmstrongNumbers {

        public static boolean isArmstrongNumber(int num) {
            // Convert the number to a string to get its getLength
            String numStr = Integer.toString(num);
            int n = numStr.length();

            // Compute the sum of the nth powers of the digits
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                sum += Math.pow(digit, n);
            }

            // Check if the sum is equal to the original number
            return sum == num;
        }

}





/*
    Armstrong Numbers
Programming challenge description:
An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
Determine if the input numbers are Armstrong numbers.
Input:
Your program should read lines from standard input. Each line has a positive integer.
Output:
Print out True if the number is an Armstrong number, or False if not.
Test 1
351
Expected Output
False
Test 2
153
Expected Output
True

1134. Armstrong Number
The k-digit number N is an Armstrong number if and only if the k-th power of each digit sums to N.

Given a positive integer N, return true if and only if it is an Armstrong number.

Example 1:
Input: 153
Output: true
Explanation:
153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
Example 2:

Input: 123
Output: false
Explanation:
123 is a 3-digit number, and 123 != 1^3 + 2^3 + 3^3 = 36.

Note:
1 <= N <= 10^8
locked leetcode question
https://leetcode.ca/all/1134.html
*/

