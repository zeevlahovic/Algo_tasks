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
