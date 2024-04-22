public class LengthOfLastWord {


    public static int lengthOfLastWord(String s){

        String[]arr = s.split(" ");

       return arr[arr.length-1].length();

    }



    public static void main(String[] args) {

        String str = "Hello World";
        String str2 = " fly me to the moon ";
        String str3 = "luffy is still joyboy";


        System.out.println(lengthOfLastWord(str));
        System.out.println(lengthOfLastWord(str2));
        System.out.println(lengthOfLastWord(str3));
    }
}
/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World" Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = " fly me to the moon " Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy" Output: 6
Explanation: The last word is "joyboy" with length 6.
Constraints:
 1 <= s.length <= 104
 s consists of only English letters and spaces ' '.
 There will be at least one word in s.

 */