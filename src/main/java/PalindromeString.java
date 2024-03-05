public class PalindromeString {

    public static boolean palindromeString(String str){
        String strWithoutSpaces = str.toLowerCase().replace(" ", "");
        String reverse = "";
        for (int i = strWithoutSpaces.length()-1; i >=0 ; i--) {
            reverse += strWithoutSpaces.charAt(i);
        }
        return strWithoutSpaces.equals(reverse);
    }


    public static void main(String[] args) {
        System.out.println(palindromeString("Was it a car or a cat I saw"));
        System.out.println(palindromeString(""));
        System.out.println(palindromeString(" "));
    }
}

/*Question-1 Palindrome String
A string is said to be palindrome after converting all uppercase letters into lowercase letters
and removing all spaces it reads the same backward as forward.
For e.g. civic, radar, level, rotor, race car are palindromes because if we try to read it from backward, it is
same as forward.
Write a method that accepts a String as argument and return true if it is a palindrome, or false otherwise.
Assume that string has only alphanumeric characters including letters and numbers and spaces, ignore
upper-lowercase characters and spaces.
Examples:
Radar → true
rotator → true
Summer→ false
Was it a car or a cat I saw → true
“” → true
“ ” → true

 */
