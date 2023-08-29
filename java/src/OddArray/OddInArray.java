package OddArray;

import java.util.HashMap;

public class OddInArray {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> repeatNumbers = new HashMap<Integer, Integer>();
        int repeatCount = 0;

        for (int i = 0; i < a.length; i++){
            int count = 0;
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j]){
                    count++;
                }
            }
            if (count >= 1) {
                if (!repeatNumbers.containsKey(a[i])) {
                    if (count % 2 != 0) {
                        return a[i];
                    }
                    repeatNumbers.put(a[i], count);
                    repeatCount += count;
                }
            }
        }
        return 0;
    }
}
