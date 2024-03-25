import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {

    public static boolean validAnagram2(String str1, String str2) {

        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        if (Arrays.equals(word1,word2)){
            return true;
        }
        return false;
    }


    public static boolean validAnagram(String str1, String str2) {

        List<Character> word1 = new ArrayList<>();
        List<Character> word2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            word1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            word2.add(str2.charAt(i));
        }

        Collections.sort(word1);
        Collections.sort(word2);

        if (word1.equals(word2)) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {

        boolean result = validAnagram("anagram", "nagaram");
        boolean result2 = validAnagram("rat", "car");

        System.out.println(result);
        System.out.println(result2);

        boolean result3 = validAnagram2("anagram", "nagaram");
        boolean result4 = validAnagram2("rat", "car");

        System.out.println(result3);
        System.out.println(result4);
    }
}
