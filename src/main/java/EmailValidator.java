public class EmailValidator {

    public static boolean emailValidator(String email) {

        int charAtCount = 0;

        if (!email.contains("@") || !email.contains(".")) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                charAtCount++;
            }
        }
        if (charAtCount > 1) {
            return false;
        }
        if (email.startsWith("@") || email.startsWith(".")) {
            return false;
        }
        if (email.endsWith("@") || email.endsWith(".")){
            return false;
        }
        if (email.contains("@.")){
            return false;
        }
        if (!email.substring(email.indexOf('@'), email.length()-1).contains(".")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String email1 = "test@cydeo.com";
        String email2 = "test@cydeo.co.uk";
        String email3 = "mike.smith@cydeo.com";
        String email4 = "mike.smith@com";
        String email5 = "@cydeo.com";
        String email6 = "test@.com";
        String email7 = "test@cydeo.";
        String email8 = "test@@cydeo.com";

        System.out.println(emailValidator(email1)); //true
        System.out.println(emailValidator(email2));//true
        System.out.println(emailValidator(email3));//true
        System.out.println(emailValidator(email4));//false
        System.out.println(emailValidator(email5));//false
        System.out.println(emailValidator(email6));//false
        System.out.println(emailValidator(email7));//false
        System.out.println(emailValidator(email8));//false
    }
}


