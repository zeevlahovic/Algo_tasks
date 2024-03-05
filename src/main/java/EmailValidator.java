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

/*Question-1 Email Validator
Your team has created a new bank website that requires email addresses to be validated.
● The email string must contain only one '@' character.
● The email string must contain an '.' character.
● The '@' must contain at least one character in front of it. e.g. "a@cydeo.com" is valid while
"@cydeo.com" is invalid.
● The '.' and '@' must be in the appropriate places. e.g. "mike.smith@com" is invalid while
"mike.smith@cydeo.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
email = "test@cydeo.com" --> true
email = "test@cydeo.co.uk --> true
email = "mike.smith@cydeo.com --> true
email = "mike.smith@com --> false
email = "@cydeo.com" --> false
email = "test@.com" --> false
email = "test@cydeo." --> false
email = "test@@cydeo.com" --> false

 */


