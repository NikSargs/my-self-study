package CamelCase;

public class CamelCase {
    public static String toCamelCase(String s) {

        if (s == null || s.length() == 0) {
            return "";
        } else {
            String[] arr = null;
            StringBuffer newString = new StringBuffer();
            arr = s.split("(-)|(_)");
            for (int i = 0; i < arr.length; i++) {
                String firstLetter = arr[i].substring(0,1).toUpperCase();
                String otherLetters = arr[i].substring(1);
                newString.append(firstLetter).append(otherLetters);
            }
            String strCamel = s.substring(0, 1) + newString.substring(1);
            return strCamel;
        }
    }
}
