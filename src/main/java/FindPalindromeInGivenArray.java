import java.util.ArrayList;

public class FindPalindromeInGivenArray {

    public static ArrayList<String> palindromeInGivenArray(String[]arr){
        ArrayList<String> isPalindrome = new ArrayList<>();
        for (String eachWord : arr) {
            if (PalindromeString.palindromeString(eachWord)){
                isPalindrome.add(eachWord);
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {

        String[] arr = {"abc", "car", "ada", "racecar", "cool"};

        String[] arr2 = {"def", "ab"};

        System.out.println(palindromeInGivenArray(arr));
        System.out.println(palindromeInGivenArray(arr2));


    }
}

/*Question-2 Find Palindrome Strings in given array
Write a method that takes in a non-empty array of Strings that will return an ArrayList which consists of
palindromic strings in given array.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric
digits.
Examples:
Input: String[] arr = {“abc”, “car”, “ada”, “racecar”, “cool”}
Output: [“ada”, “racecar”]
Explanation: These two are the only palindrome strings in the given array
Input: String[] arr = {“def”, “ab”}
Output:[]

 */
