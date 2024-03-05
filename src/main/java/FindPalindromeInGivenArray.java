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
