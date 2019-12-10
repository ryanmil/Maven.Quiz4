package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length() / 2;

        char[] chars = str.toCharArray();
        chars[index] = Character.toUpperCase(chars[index]);

        return new String(chars);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length() / 2;

        char[] chars = str.toCharArray();
        chars[index] = Character.toLowerCase(chars[index]);

        return new String(chars);
    }

    public static Boolean isIsogram(String str) {
        Set<Character> charSet = new HashSet<>();
        for (Character c : str.toCharArray()) {
            if(!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(i == 0 && str.charAt(i) != str.charAt(i + 1)) {
                result += str.charAt(i);
            } else if(i == (str.length() - 1) && str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i);
            } else if (str.charAt(i) != str.charAt(i + 1) && str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }
}