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
