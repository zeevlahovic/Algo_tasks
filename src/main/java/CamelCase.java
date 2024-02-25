public class CamelCase {

    public static String brakeCamelCase(String str) {
        String result = "";
        if (str == null || str.isEmpty()) {
            return result;
        }
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (!Character.isUpperCase(each)) {
                result += each;
            } else {
                result += " " + each;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(brakeCamelCase("camelCase"));
    }


}
