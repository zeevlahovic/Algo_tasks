import java.util.*;

public class ValidPalindrome {

    public static boolean validPalindrome(String str) {

        str = str.toLowerCase();

        List<Character> word = new ArrayList<>();
        List<Character> reversedWord = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            word.add(str.charAt(i));
        }
        word.removeIf(p -> !Character.isLetter(p));

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedWord.add(str.charAt(i));
        }
        reversedWord.removeIf(p -> !Character.isLetter(p));

        if (word.equals(reversedWord)) {
            return true;
        }
        return false;
    }

    public static boolean validPalindrome2(String str) {

        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {

        boolean result = validPalindrome("Do geese see God?");

        System.out.println(result);

        boolean result2 = validPalindrome("Do geese see God?");
        System.out.println(result);
    }
}



