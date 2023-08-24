package Sort;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSort {
    public static int sortDesc(final int num){
//        int numReverse = 0;
        StringBuilder str = new StringBuilder();
        String temp = Integer.toString(num);
        Integer[] numArray = new Integer[temp.length()];
        for (int i = 0; i < temp.length(); i++){
            numArray[i] = Character.getNumericValue(temp.charAt(i));
            System.out.println(numArray[i]);
        }
        Arrays.sort(numArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(numArray));
        for (Integer integer : numArray) {
            str.append(integer);
        }
        //System.out.println(numReverse);
        return Integer.parseInt(str.toString());
    }
}
