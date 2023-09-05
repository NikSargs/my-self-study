package OddOrEven;

import java.util.ArrayList;

public class OddOrEven {
    static int find(int[] integers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i < integers.length; i++){
            if(integers[i] % 2 == 0){
                evenNumbers.add(integers[i]);
            }
            if (integers[i] % 2 != 0){
                oddNumbers.add(integers[i]);
            }
        }
        if (evenNumbers.size() == 1) {
            return evenNumbers.get(0);
        }
        if (oddNumbers.size() == 1) {
            return oddNumbers.get(0);
        }
        return 0;
    }
}
