package calculator;

import java.util.ArrayList;

public class Calculating {

    public int sum(ArrayList<Integer> arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        return total;
    }
}
