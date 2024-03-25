import java.util.*;

public class ValidPalindrome {

    public static boolean validPalindrome(String str) {

        String strLowerCase = str.toLowerCase();

        List<Character> word = new ArrayList<>();
        List<Character> reversedWord = new ArrayList<>();

        for (int i = 0; i < strLowerCase.length(); i++) {
            word.add(strLowerCase.charAt(i));
        }
         word.removeIf(p->!Character.isLetter(p));

        for (int i = strLowerCase.length()-1; i >=0 ; i--) {
            reversedWord.add(strLowerCase.charAt(i));
        }
        reversedWord.removeIf(p->!Character.isLetter(p));

        if (word.equals(reversedWord)){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
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
    }
}


