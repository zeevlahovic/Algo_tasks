public class StringReverse {

    public static String reverseString (String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
       return reversed;
    }


   public static void main(String[] args) {

       String str = "Java";
       String reversed = "";

       for (int i = str.length()-1; i >= 0 ; i--) {
           reversed += str.charAt(i);
       }
       System.out.println(reversed);



   }
}
