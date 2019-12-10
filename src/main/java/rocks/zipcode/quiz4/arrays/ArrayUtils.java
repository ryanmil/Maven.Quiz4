package rocks.zipcode.quiz4.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        int mid = values.length / 2;
        String[] newArr = new String[values.length - 1];

        for (int i = 0; i < values.length; i++) {
            if(i < mid) {
                newArr[i] = values[i];
            } else if (i > mid) {
                newArr[i-1] = values[i];
            }
        }

        return  newArr;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values, values.length - 1);
    }
}