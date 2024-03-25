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



    public static void main(String[] args) {

        boolean result1 = validAnagram2("anagram", "nagaram");
        boolean result2 = validAnagram2("rat", "car");

        System.out.println(result1);
        System.out.println(result2);
    }
}
